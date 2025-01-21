import java.sql.DriverManager;

public class Oracle {
    static final String URL = "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
    // static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "orclpdbuser";
    //  static final String USER = "postgres";
    static final String PASSWORD = "isdb62";

        public static Connection getConnection(){
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }
}
