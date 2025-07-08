package dao;

import model.Question;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public ArrayList<Question> retriveQuestion(){
        ArrayList<Question>questions=new ArrayList<>();
        try {
            conn =DatabaseConnection.connect();
            String query="SELECT title, option1, option2, option3, option4, correctOption FROM Questions";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet questionSet =ps.executeQuery();

            while(questionSet.next()) {
                String questionTitle=questionSet.getString("title");
                String choice1=questionSet.getString("option1");
                String choice2=questionSet.getString("option2");
                String choice3=questionSet.getString("option3");
                String choice4=questionSet.getString("option4");
                int correctOption=questionSet.getInt("correctOption");

                Question questionss=new Question(questionTitle,choice1,choice2,choice3,choice4,correctOption);
                questions.add(questionss);}



            return questions;






        }
        catch (ClassNotFoundException  | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
