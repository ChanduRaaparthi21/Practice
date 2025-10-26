package com.chandu.java.Strings.Assignments;

import java.util.Scanner;

public class remove_spaces_from_starting_ending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string with stating and ending spaces");

        String userInput = sc.nextLine();
        System.out.println("before trim, length is : "+userInput.length());

        String removeSpaces = userInput.trim();
        System.out.println("after trim, length is : "+removeSpaces.length());

        System.out.println(removeSpaces);
    }

}
