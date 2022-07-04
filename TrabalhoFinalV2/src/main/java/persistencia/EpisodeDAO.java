package persistencia;

import dadosAPI.Episode;
import dadosAPI.EpisodeReq;
import excecoes.DeleteException;
import excecoes.InsertException;
import excecoes.SelectException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EpisodeDAO {

    private static EpisodeDAO instance = null;

    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement selectAll;

    public static EpisodeDAO getInstance() throws ClassNotFoundException, SQLException, SelectException {
        if(instance == null){
            instance = new EpisodeDAO();
        }
        return instance;
    }

    private EpisodeDAO() throws ClassNotFoundException, SQLException, SelectException{
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('id_character')");
        insert = conexao.prepareStatement("insert into episode values(?, ?, ?, ?, ?, ?, ?, ?)");
        select = conexao.prepareStatement("select * from episode where id_episode = ?");
        delete = conexao.prepareStatement("delete from episode where id_episode = ?");
        selectAll = conexao.prepareStatement("select * from episode");
    }

    private int selectNewId() throws SelectException{
        try{
            ResultSet rs = selectNewId.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new SelectException("Erro ao buscar novo id da tabela episode!!");
        }
        return 0;
    }

    public void insert(EpisodeReq episode) throws InsertException, SelectException{
        try {
            insert.setInt(1, selectNewId());
            insert.setInt(2, episode.getEpisode_id());
            insert.setString(3, episode.getTitle());
            insert.setString(4, episode.getSeason());
            insert.setString(5, episode.getEpisode());
            insert.setString(6, episode.getAir_date());
            insert.setString(7, Arrays.toString(episode.getCharacters()));
            insert.setString(8, episode.getSeries());
        } catch (SQLException e) {
            throw new InsertException("Erro ao inserir episodio!!");
        }
    }

    public Episode select(int character) throws SelectException{
        try {
            select.setInt(1, character);
            ResultSet rs = select.executeQuery();
            if(rs.next()){
                int id = rs.getInt(1);
                Integer episode_id = rs.getInt(2);
                String title = rs.getString(3);
                String season = rs.getString(4);
                String episode = rs.getString(5);
                String air_date = rs.getString(6);
                String characters = rs.getString(7);
                String series = rs.getString(8);
                return new Episode(id, episode_id,title,season,episode,air_date,characters,series);
            }
        } catch (SQLException e) {
            throw new SelectException("Erro buscar episodio!!");
        }
        return null;
    }

    public void delete(EpisodeReq episode) throws DeleteException {
        try{
            delete.setInt(1, episode.getEpisode_id());
            delete.executeUpdate();
        } catch (SQLException e) {
            throw new DeleteException("Erro ao deletar episodio!!");
        }

    }

    public List<Episode> selectAll() throws SelectException{

        List<Episode> episodes = new LinkedList<Episode>();

        try{
            ResultSet rs = selectAll.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                Integer episode_id = rs.getInt(2);
                String title = rs.getString(3);
                String season = rs.getString(4);
                String episode = rs.getString(5);
                String air_date = rs.getString(6);
                String characters = rs.getString(7);
                String series = rs.getString(8);

                episodes.add(new Episode(id, episode_id,title,season,episode,air_date,characters,series));
            }
        } catch (SQLException e) {
            throw  new SelectException("Erro ao buscar episodios!!");
        }
        return episodes;
    }

}
