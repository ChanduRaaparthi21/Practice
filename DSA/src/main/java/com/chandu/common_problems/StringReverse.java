package com.chandu.common_problems;

import java.util.Scanner;

public class StringReverse {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");

        String s = sc.next();
        String ss = "";

        for(int i=s.length()-1; i>=0; i--){
            ss += s.charAt(i);
        }
        System.out.println(ss);
    }


}
