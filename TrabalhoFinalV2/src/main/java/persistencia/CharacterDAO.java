package persistencia;

import dadosAPI.CharacterResponse;
import excecoes.InsertException;
import excecoes.SelectException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class CharacterDAO {

    private static CharacterDAO instance = null;

    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;

    public static CharacterDAO getInstance() throws ClassNotFoundException, SQLException, SelectException {
        if(instance == null){
            instance = new CharacterDAO();
        }
        return instance;
    }

    private CharacterDAO() throws ClassNotFoundException, SQLException, SelectException{
        Connection conexao = Conexao.getConexao();
        selectNewId = conexao.prepareStatement("select nextval('id_character')");
        insert = conexao.prepareStatement("insert into endereco values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        select = conexao.prepareStatement("select * from character where id_character = ?");
    }

    private int selectNewId() throws SelectException{
        try{
            ResultSet rs = selectNewId.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new SelectException("Erro ao buscar novo id da tabela endereco");
        }
        return 0;
    }

    public void insert(CharacterResponse character) throws InsertException, SelectException{
        try {
            insert.setInt(1, selectNewId());
            insert.setInt(2, character.getChar_id());
            insert.setString(3, character.getName());
            insert.setString(4, character.getBirthday());
            insert.setString(5, Arrays.toString(character.getOccupation()));
            insert.setString(6, character.getImg());
            insert.setString(7, character.getStatus());
            insert.setString(8, character.getNickname());
            insert.setString(9, Arrays.toString(character.getAppearance()));
            insert.setString(10, character.getPortrayed());
            insert.setString(11, character.getCategory());
            insert.setString(12, Arrays.toString(character.getBetter_call_saul_appearance()));
        } catch (SQLException e) {
            throw new InsertException("Erro ao inserir endereco");
        }
    }

    public CharacterResponse select(int character) throws SelectException{
        try {
            select.setInt(1, character);
            ResultSet rs = select.executeQuery();
            if(rs.next()){
                int id = rs.getInt(1);
                String
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
