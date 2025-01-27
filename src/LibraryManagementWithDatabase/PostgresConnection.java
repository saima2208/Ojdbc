package LibraryManagementWithDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {
    static final String URL = "jdbc:postgresql://localhost:5432/postgres"; // Service Name
    static final String USERNAME = "postgres";
    static final String PASSWORD = "isdb62";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
