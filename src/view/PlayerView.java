package view;


import model.User;

import java.util.Scanner;

public class PlayerView {
    public static  void view(User user){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome one of the great player AKA "+user.getUsername());
        while(true){
            System.out.println("Enter 1 to play the quiz");
            System.out.println("Enter 2 to see the scoreboard");
            System.out.println("Enter 3 to exit");

            int playerChoice= Integer.parseInt(input.nextLine());

            if(playerChoice==1){
                QuizView.quizView(user);

            }
            else if (playerChoice==2){

            }
            else if (playerChoice==3){
                break;
            }
            else{
                System.out.println("Please enter the correct option only");
            }

        }
    }
}
