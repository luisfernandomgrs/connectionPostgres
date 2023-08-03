import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://192.168.0.106:5432/mydb", "luisf", "admin");
            //connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test_postgres", "luisf", "admin");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver PostgreSQL JDBC não encontrado.");
            e.printStackTrace();
            return;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados.");
            e.printStackTrace();
            return;
        }
        if (connection != null) {
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
        } else {
            System.out.println("Falha ao conectar com o banco de dados.");
        }
    }
}