package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
     static Properties env;

    static {
        try {
            env = LoadEnv.loadEnv(".env");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private  static final String dbNAme=env.getProperty("DB_NAME");
    private  static final String path= env.getProperty("DB_PATH");
    private static  final String password= env.getProperty("DB_PASSWORD");
    private  static final String username= env.getProperty("DB_USER");





    public static Connection connect() throws ClassNotFoundException, SQLException {
        Connection conn =null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(path+dbNAme, username,password);
        return conn;

    }

}
