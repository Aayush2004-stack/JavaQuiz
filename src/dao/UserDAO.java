package dao;

import model.User;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class UserDAO {
    public boolean insertUser(User user){
        boolean isUserInserted = false;
        Connection conn = null;
        try {
            conn = DatabaseConnection.connect();
            if(conn != null){
                String query = "INSERT INTO user (username, password) VALUES (?, ?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getPassword());
                int row = ps.executeUpdate();
                if(row > 0){
                    isUserInserted = true;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return isUserInserted;
    }
    public boolean getUser(User user){

        boolean isUserFound=false;
        Connection conn =null;
        try{
            conn = DatabaseConnection.connect();
            if(conn != null){
                String query = "SELECT username, password, isGameMaster FROM user WHERE username = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, user.getUsername());

                ResultSet resultSet =ps.executeQuery();
                if(resultSet.next()){
                    String username= resultSet.getString("username");
                    String password= resultSet.getString("password");
                    boolean isGameMaster=resultSet.getBoolean("isGameMaster");
                    if(password.equals(user.getPassword())){
                        isUserFound=true;
                    }
                    else{
                        System.out.println("password doesn't match");
                    }

                }

            }

        }
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return isUserFound;
    }
}