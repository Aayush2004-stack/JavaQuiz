package controller;

import dao.QuestionDAO;
import model.Question;
import service.QuestionService;

import java.util.ArrayList;
import java.util.Scanner;


public class QuestionController {

    QuestionService questionSerice =new QuestionService();
    ArrayList<Question> question=questionSerice.retriveQuestion();

    public int playQuiz(){
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
        return score;
    }
    public void displayQuestion(){
        //TODO Sn should be id of the question rather than int i
        int i =1;
        for (Question ques: question){
            System.out.println(i+") "+ques.getTitle()+"\n");
            ques.showOptions();
            System.out.println("Correct answer:"+ques.getCorrect_index());

            i++;}


    }


}
