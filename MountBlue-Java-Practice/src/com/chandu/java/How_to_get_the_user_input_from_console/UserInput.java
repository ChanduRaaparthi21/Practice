package com.chandu.java.How_to_get_the_user_input_from_console;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = scanner.nextLine(); //nextLine for string values
        System.out.println("userName : "+username);
        System.out.println("Enter your age");
        int age = scanner.nextInt(); //nextInt for int values
        System.out.println("age : "+age);


        scanner.close(); //mana pani ayyaka close the scanner after the user input



    }
}
