package view;


import model.User;

import java.util.Scanner;

public class PlayerView {
    public static  void view(User user){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome one of the great player AKA "+user.getName());
        while(true){
            System.out.println("\nEnter 1 to play the quiz");
            System.out.println("Enter 2 to see the scoreboard");
            System.out.println("Enter 3 to logout");


            try{
                int playerChoice= Integer.parseInt(input.nextLine());

                if(playerChoice==1){
                    QuizView.quizView(user);

                }
                else if (playerChoice==2){
                    ScoreboardView.viewScoreboard();

                }
                else if (playerChoice==3){
                    System.out.println("Logging out\n");
                    break;
                }
                else{
                    System.out.println("Please enter the correct option only\n");
                }

            } catch (RuntimeException e) {
                System.out.println("Please enter a valid number only");
            }


        }
    }
}
