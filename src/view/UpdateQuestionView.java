package view;

import controller.QuestionController;
import service.QuestionService;

import java.util.Scanner;

public class UpdateQuestionView {
    public static void updateQuestion(){
        Scanner input =new Scanner(System.in);
        QuestionController questionController=new QuestionController();
        QuestionService questionService=new QuestionService();

        System.out.println("Questions:");
        questionController.displayQuestion();
        System.out.println("Which question you want to update? Give the Id of the question");
        int userChoice= Integer.parseInt(input.nextLine());

        System.out.println("What is the question?");
        String questionTitle= input.nextLine();

        System.out.println("Option 1:");
        String optionOne =input.nextLine();

        System.out.println("Option 2:");
        String optionTwo =input.nextLine();

        System.out.println("Option 3:");
        String optionThree =input.nextLine();

        System.out.println("Option 4:");
        String optionFour =input.nextLine();

        System.out.println("Which option is the right answer? Give the option number only");
        int correctIndex=Integer.parseInt(input.nextLine());

        if(questionService.updateQuestion(questionTitle,optionOne,optionTwo,optionThree,optionFour,correctIndex,userChoice)){
            System.out.println("Question updated successfully");
        }



    }
}
