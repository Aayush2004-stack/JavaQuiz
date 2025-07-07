package dao;

import model.Question;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QuestionDAO {
    Connection conn=null;
    public boolean insertQuestion(Question question){

        boolean isAdded=false;
        try {
            conn =DatabaseConnection.connect();
            if(conn!=null){
                String query="INSERT into Questions (title, option1, option2, option3, option4, correctOption) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement ps =conn.prepareStatement(query);
                ps.setString(1,question.getTitle());
                ps.setString(2, question.getOptions()[0]);
                ps.setString(3, question.getOptions()[1]);
                ps.setString(4, question.getOptions()[2]);
                ps.setString(5, question.getOptions()[3]);
                ps.setInt(6, question.getCorrect_index());

                int row =ps.executeUpdate();
                if(row>0){
                    isAdded=true;
                }
            }

        } catch (ClassNotFoundException  | SQLException e) {
            throw new RuntimeException(e);
        }

        return isAdded;
    }
}
