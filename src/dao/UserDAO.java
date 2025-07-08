package dao;

import model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    Connection conn = null;
    public boolean insertUser(User user){
        boolean isUserInserted = false;

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

    public User getUser(User user){


        try{
            conn = DatabaseConnection.connect();
            if(conn != null){
                String query = "SELECT username, password, isGameMaster FROM user WHERE username = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, user.getUsername());

                ResultSet userSet =ps.executeQuery();
                if(userSet.next()){
                    String password= userSet.getString("password");
                    boolean isGameMaster=userSet.getBoolean("isGameMaster");


                    user.setGameMaster(isGameMaster);
                    user.setUsername(user.getUsername());


                    if(password.equals(user.getPassword())){
                        return user;
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

        return null;
    }
}