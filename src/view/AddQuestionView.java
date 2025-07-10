package view;

import controller.QuestionController;
import service.QuestionService;


import java.util.Scanner;

public class AddQuestionView {
    public static  void addQuestion(){
        QuestionService questionService =new QuestionService();
        Scanner input = new Scanner(System.in);

        System.out.println("How many question you want to add?");
        int numberOfQuestion=Integer.parseInt(input.nextLine());

        while(numberOfQuestion>0){
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

            if(questionService.addQuestion(questionTitle,optionOne,optionTwo,optionThree,optionFour,correctIndex)){
                System.out.println("Question added successfully");
            }
            else {
                System.out.println("Error adding the question");
            }
            numberOfQuestion--;

        }




    }
}
