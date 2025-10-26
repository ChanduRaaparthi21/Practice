package com.chandu.java.UserInput;

import java.util.Scanner;

/*
For Integr = nextInt();
for string = nextLine();
for double = nextDouble();
for float = nextFloat();

* */
public class userInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter u r name");
        String userName = sc.nextLine();
        System.out.println("Hai "+userName+" , How are you?");


        sc.close();
    }
}
