package view;

import controller.QuestionController;
import service.QuestionService;

import java.util.Scanner;

public class DeleteQuestionView {
    public static void deleteQuestion(){
        QuestionService questionService =new QuestionService();
        QuestionController questionController=new QuestionController();
        Scanner input = new Scanner(System.in);

        System.out.println("Questions: ");
        questionController.displayQuestion();
        System.out.println("Which question do you want to delete? Give the id of the question: ");
        int userChoice= Integer.parseInt(input.nextLine());

        if(questionService.deleteQuestion(userChoice)){
            System.out.println("Question removed successfully");
        }
    }
}
