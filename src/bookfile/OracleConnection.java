package bookfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {

    static final String URL = "jdbc:oracle:thin:@localhost:1521/ORCLPDB"; // Service Name
    // static final String URL = "jdbc:oracle:thin:@localhost:1521:ORCLPDB"; // SID
    static final String USERNAME = "orclpdbuser";
    static final String PASSWORD = "isdb62";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
