package com.revature;

import com.revature.model.User;

import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //welcome();
        //register();
        
    }


    //To welcome a user to the bank
    static void welcome(){
        //Welcome SplashScreen
        Scanner scanner = new Scanner(System.in);
        System.out.printf("-------------------------------------------------\n");
        System.out.printf("\t\t\tWelcome To The Code Bank\n");
        System.out.printf("-------------------------------------------------\n");
        System.out.printf("Please (1)Login or (2)Register\n");

        String input = scanner.nextLine(); //taking input from user

        //checking for integer input
        try{
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            input = "0";
        }

        //Switch case to login or register a user
        switch (Integer.parseInt(input)){
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            default:
                System.out.println("Input Not Recognized");
                welcome();
        }
    }

    //Allow a user to connect to their account on the DB
    public static void login(){
        //TODO I Need a Database to implement this.
    }

    //TODO push this new user to the SQl Database
    //Register a new user and push the object to a SQL Database
    public static void register(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Username:");
        String username = scanner.nextLine();
        System.out.print("Please enter your Password:");
        String password1 = scanner.nextLine();
        System.out.print("Please confirm your Password:");
        String password2 = scanner.nextLine();

        if(password1.equals(password2)){
            User newUser = new User(username, password1);
            //Connect here to DB
        }else {
            System.out.println("The passwords do not match.");
            register();
        }
    }
}
