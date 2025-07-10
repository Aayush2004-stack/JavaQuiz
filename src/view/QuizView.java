package view;
import controller.QuestionController;
import controller.ScoreController;
import model.Scoreboard;
import model.User;


public class QuizView {

    public static void quizView(User user){
        ScoreController scoreController=new ScoreController();
        QuestionController qc =new QuestionController();


        int score =qc.playQuiz(user).getScore();
        System.out.println("Score: "+ score);
        if(scoreController.addToScoreboard(new Scoreboard(user.getUserId(),score)))
        {System.out.println("Score updated in the scoreboard");
        }

    }
}
