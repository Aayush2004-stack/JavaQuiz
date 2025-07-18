package view;

import model.User;

import java.util.Scanner;

public class GameMasterView {


    public static void view(User user){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome back our Game Master AKA "+user.getName()+"\n");

        while (true){

            System.out.println("Enter 1 to add questions");
            System.out.println("Enter 2 to update questions");
            System.out.println("Enter 3 to remove questions");
            System.out.println("Enter 4 to test the quiz");
            System.out.println("Enter 5 to see the scoreboard");
            System.out.println("Enter 6 to logout");

            try{
                int adminChoice= Integer.parseInt(input.nextLine());

                if(adminChoice==1){
                    AddQuestionView.addQuestion();
                }
                else if (adminChoice==2){
                    UpdateQuestionView.updateQuestion();
                }
                else if(adminChoice==3){
                    DeleteQuestionView.deleteQuestion();
                }
                else if(adminChoice==4){
                    QuizView.quizView(user);
                }
                else if(adminChoice==5){
                    ScoreboardView.viewScoreboard();
                }


                else if(adminChoice==6){
                    System.out.println("Logging out\n");
                    break;
                }
                else{
                    System.out.println("Please enter a valid option only\n");
                }
            } catch (RuntimeException e) {
                System.out.println("Please enter a valid number only");
            }


        }


    }
}
