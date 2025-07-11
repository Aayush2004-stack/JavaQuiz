package view;

import controller.UserController;
import java.util.Scanner;

public class SignUpView {
    public static void showSignUpView(){
        UserController userController = new UserController();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name= scan.nextLine();
        System.out.println("Enter username: ");
        String username = scan.nextLine();
        System.out.println("Enter password: ");
        String password = scan.nextLine();
        if(userController.signUp(name,username, password)){
            System.out.println("Signed Up successfully\n");
        }
        else{
            System.out.println("error\n");
        }
    }
}
