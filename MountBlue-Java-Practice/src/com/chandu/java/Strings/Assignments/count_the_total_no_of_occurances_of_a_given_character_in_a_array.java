package com.chandu.java.Strings.Assignments;

import java.sql.Struct;
import java.util.Scanner;

public class count_the_total_no_of_occurances_of_a_given_character_in_a_array {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String userString = sc.nextLine();
        System.out.println("enter char");
        char userChar = sc.next().charAt(0);


        int count=0;

        for (int i=0; i<userString.length();i++){
            if(userString.charAt(i)==userChar){
                count++;
            }
        }
        System.out.println(count);






    }

}
