package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar() throws SQLException {
        
       String servidor = "localhost";
       String porta = "3306";
       String banco = "projetoLogin";
       String usuario = "root";
       String senha = "S3n4c@2026";
       String url = "jdbc:mysql://"+ servidor + ":"+ porta + "/" + banco ;
       
       return DriverManager.getConnection(url, usuario, senha);
        
    } //Fim do conectar()  
    
    public static void main(String[] args) {
        // Abre a conexão e fecha automaticamente ao terminar.
        try (Connection conexao = conectar()) {

            if (conexao.isValid(5)) {
                System.out.println("Conectado ao MySQL com sucesso!");
            } else {
                System.out.println("A conexão não respondeu ao teste.");
            }

        } catch (SQLException erro) {

            System.out.println("Erro ao conectar ao banco:");
            System.out.println(erro.getMessage());

        }
    }
    
} //fim da classe
