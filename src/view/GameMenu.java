package view;

import controller.UserController;
import java.util.Scanner;

public class GameMenu {

    public static  void showMenu(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Are you ready for the quizzz!!");
            System.out.println("Enter 1: Sign Up");
            System.out.println("Enter 2: Log In");
            System.out.println("Enter 3: Exit");
            int option = Integer.parseInt(input.nextLine());
            if(option == 1){
                SignUpView.showSignUpView();
            } else if (option==2) {
                LogInView.showLogInView();

            }
            else if(option==3){
                System.out.println("Thank you for playing the quiz");
            }
            else{
                System.out.println("Please enter the valid options only");
            }

        }

    }
}
