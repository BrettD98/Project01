package com.revature;

import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        welcome();
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

    public static void login(){

    }

    public static void register(){

    }
}
