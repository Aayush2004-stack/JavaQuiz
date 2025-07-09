package service;


import dao.QuestionDAO;
import model.Question;

import java.util.ArrayList;


public class QuestionService {

    private QuestionDAO questionDao =new QuestionDAO();

    public boolean addQuestion(String title, String option_1, String option_2, String option_3, String option_4, int correct_index){
        Question question =new Question(title, option_1,option_2,option_3,option_4,correct_index);
        return questionDao.insertQuestion(question);
    }

    public ArrayList<Question> retriveQuestion(){
        return questionDao.retriveQuestion();

    }
}
