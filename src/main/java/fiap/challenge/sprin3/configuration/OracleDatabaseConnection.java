package fiap.challenge.sprin3.configuration;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDatabaseConnection {
    private static final String URL = "jdbc:oracle:thin:@fiap.com.br:1521:ORCL";
    private static final String USER = "RM553108";
    private static final String PASSWORD= "300305";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
