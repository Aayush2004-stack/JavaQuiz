package dao;

import model.Scoreboard;

import java.sql.*;
import java.util.ArrayList;

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
    public ArrayList<Scoreboard> getScoreDetails(){
        ArrayList<Scoreboard>scores= new ArrayList<>();
        try {
            conn=DatabaseConnection.connect();
            if(conn!=null){
                String query ="SELECT u.username, s.score, s.playedDate FROM user u JOIN score s ON u.userId =s.userID ORDER BY s.score DESC";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet resultSet = ps.executeQuery();
                while(resultSet.next()){
                    String username =resultSet.getString("username");
                    int score =resultSet.getInt("score");
                    Date playedDate = resultSet.getDate("playedDate");

                    Scoreboard scoreboard=new Scoreboard(username,score,playedDate);
                    scores.add(scoreboard);
                }

            }
        }
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return scores;

    }
}
