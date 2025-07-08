package view;

import controller.QuestionController;
import controller.ScoreController;
import model.Question;
import model.Scoreboard;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizView {
    public static void quizView(){
        int score=0;
        QuestionController questionController =new QuestionController();
        ScoreController scoreController=new ScoreController();

        Scanner input = new Scanner(System.in);

        ArrayList<Question> question=questionController.retriveQuestion();
        int i =1;
        for (Question ques: question){

            System.out.println(i+") "+ques.getTitle()+"\n");
            ques.showOptions();
            System.out.println("Choose one answer: ");
            int answer=Integer.parseInt(input.nextLine());

            if(ques.checkAnswer(answer)){
                score++;
            }


            i++;

        }

        System.out.println("Score: "+ score);
        if(scoreController.score(score)){
            System.out.println("Score updated in the scoreboard");
        }

    }
}
