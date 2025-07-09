package view;

import controller.QuestionController;

import java.util.Scanner;

public class UpdateQuestionView {
    public static void updateQuestionView(){
        Scanner input =new Scanner(System.in);
        QuestionController qc =new QuestionController();

        System.out.println("Questions:");
        qc.displayQuestion();
        System.out.println("Which question you want to update?");
        int userChoice= Integer.parseInt(input.nextLine());



    }
}
