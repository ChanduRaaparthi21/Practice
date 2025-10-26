package com.chandu.common_problems;

import java.util.Scanner;

public class Palindrome_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a palindrome");
        String s1 = sc.next();
        s1 = s1.toLowerCase();

        int n = s1.length();

        boolean palindrome = true;

        for(int i=0; i<n/2; i++){

            if(s1.charAt(i)!=s1.charAt(n-i-1)){
                palindrome = false;
                break;
            }

        }
        if(palindrome){
            System.out.println("given String is palindrome");
        }else{
            System.out.println("given string is not palindrome");
        }




    }

}
