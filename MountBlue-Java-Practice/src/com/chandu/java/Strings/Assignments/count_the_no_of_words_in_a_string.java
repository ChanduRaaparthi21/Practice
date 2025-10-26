package com.chandu.java.Strings.Assignments;

import java.util.Scanner;

public class count_the_no_of_words_in_a_string {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");

        String userInput = sc.nextLine();

        String[] arr = userInput.trim().split(" ");
        System.out.println(arr.length);



    }
}
