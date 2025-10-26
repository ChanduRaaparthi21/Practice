package com.chandu.java.How_to_get_the_user_input_from_console;

import java.util.Scanner;

public class checkEvenOddnumFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(checkEvenOdd(number));

            System.out.print("Do you want to enter another number? (y/n): ");
            continueInput = scanner.next();
        } while (continueInput.equalsIgnoreCase("y"));

        scanner.close();
    }

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return number + " is even";
        } else {
            return number + " is odd";
        }
    }
}