package dao;

import model.Scoreboard;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ScoreDAO {
    Connection conn =null;

    public boolean addScore(Scoreboard score){
        boolean isScoreAdded = false;
        try {
            conn =DatabaseConnection.connect();
            if (conn!=null){
                String query ="INSERT INTO score (userId, score) VALUES (?, ?)";
                PreparedStatement ps =conn.prepareStatement(query);
                ps.setInt(1,score.getUserId());
                ps.setInt(2,score.getScore());
                int row = ps.executeUpdate();
                if(row>0){
                    isScoreAdded=true;

                }
            }

        }
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return isScoreAdded;


    }
}
