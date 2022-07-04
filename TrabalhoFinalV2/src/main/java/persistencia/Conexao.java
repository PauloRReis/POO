package persistencia;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Connection conexao = null;
    private static String senha;

    private Conexao(){}

    public static void setSenha(String password){
        senha = password;
    }

    public static Connection getConexao() throws ClassNotFoundException, SQLException{

        if(conexao == null){
            String url = "jdbc:postfresql://localhost:5432/bdbuscaBB";
            String usuario = "postgres";
            Class.forName("org.postfresql.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);
        }

        return conexao;
    }

}
