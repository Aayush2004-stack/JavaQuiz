package view;

import controller.UserController;


import java.util.Scanner;

public class LogInView {
    public static void showLogInView(){
        UserController userController = new UserController();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scan.nextLine();

        System.out.println("Enter password: ");
        String password = scan.nextLine();

        if(!userController.logIn(username, password)){
            System.out.println("error logging in");
        }



    }
}
