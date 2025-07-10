package controller;


import model.Question;
import model.Scoreboard;
import model.User;
import service.QuestionService;
import java.util.ArrayList;
import java.util.Scanner;


public class QuestionController {

    QuestionService questionService =new QuestionService();
    ArrayList<Question> question=questionService.retriveQuestion();

    public Scoreboard playQuiz(User user){
        int score=0;
        Scanner input = new Scanner(System.in);
        int i =1;
        for (Question ques: question){
            System.out.println(i+") "+ques.getTitle()+"\n");
            ques.showOptions();
            System.out.println("Choose one answer: ");
            int answer=Integer.parseInt(input.nextLine());

            if(ques.checkAnswer(answer)){
                score++;
            }
            i++;}
        Scoreboard scoreboard =new Scoreboard(user.getUserId(),score);

        return scoreboard;
    }
    public void displayQuestion(){


        for (Question ques: question){
            System.out.println(ques.getQuestionId()+") "+ques.getTitle()+"\n");
            ques.showOptions();
            System.out.println("Correct answer:"+ques.getCorrect_index()+"\n\n");
            }

    }


}
