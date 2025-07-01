import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static String path="jdbc:mysql://localhost:3306/";
    private static String dbNAme="quizGame";
    private static String username="root";
    private static String password="";

    public static Connection connect() throws ClassNotFoundException, SQLException {
        Connection conn =null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(path+dbNAme, username,password);
        return conn;

    }

    public static void main(String[] args) {
        try {
            Connection conn =DatabaseConnection.connect();
            if(conn != null){
                System.out.println("Connected successfully");
            }
            else {
                System.out.println("Not connected");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
