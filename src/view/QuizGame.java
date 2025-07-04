package view;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Are you ready for the quiz!!");
        System.out.println("Enter 1: Sign Up\nEnter 2: Log In");
        System.out.println("Enter 3: Exit");
        int option= Integer.parseInt(input.nextLine());

        if(option==1){
            System.out.println("Enter username: ");
            String username= input.nextLine();
            System.out.println("Enter password");
            String password= input.nextLine();
        }



    }
}