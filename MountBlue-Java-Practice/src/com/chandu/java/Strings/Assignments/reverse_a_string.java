package com.chandu.java.Strings.Assignments;

import java.util.Scanner;

public class reverse_a_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string");
        String userInput=sc.nextLine();

        String reverse = "";

        for(int i=userInput.length()-1; i>=0; i--){

            reverse = reverse+userInput.charAt(i);

        }
        System.out.println(reverse);

    }
}
