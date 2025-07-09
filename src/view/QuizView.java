package view;
import controller.QuestionController;
import controller.ScoreController;


public class QuizView {

    public static void quizView(){
        ScoreController scoreController=new ScoreController();
        QuestionController qc =new QuestionController();

        int score = qc.playQuiz();
        System.out.println("Score: "+ score);
        if(scoreController.score(score))
        {System.out.println("Score updated in the scoreboard");
        }





    }
}
