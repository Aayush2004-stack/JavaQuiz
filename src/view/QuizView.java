package view;

import controller.QuestionController;
import model.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizView {
    public static void quizView(){
        QuestionController questionController =new QuestionController();
        Scanner input = new Scanner(System.in);

        ArrayList<Question> question=questionController.retriveQuestion();
        int i =1;
        for (Question ques: question){

            System.out.println(i+") "+ques.getTitle()+"\n");
            System.out.println("1) "+ques.getOptions()[0]);
            System.out.println("2) "+ques.getOptions()[1]);
            System.out.println("3) "+ques.getOptions()[2]);
            System.out.println("4) "+ques.getOptions()[3]);
            System.out.println("Choose one answer: ");
            System.out.println();
            int answer=Integer.parseInt(input.nextLine());
            i++;

        }

    }
}
