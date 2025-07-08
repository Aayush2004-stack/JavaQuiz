package view;

import model.User;

import java.util.Scanner;

public class GameMasterView {


    public static void view(User user){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome back our Game Master AKA "+user.getUsername()+"\n");
        System.out.println("Enter 1 to add questions");
        System.out.println("Enter 2 to update questions");
        System.out.println("Enter 3 to test the quiz");
        System.out.println("Enter 4 to see the scoreboard");

        int adminChoice= Integer.parseInt(input.nextLine());

        if (adminChoice==1){
            AddQuestionView.addQuestionView();
        }

        if(adminChoice==3){
            QuizView.quizView();
        }

    }
}
