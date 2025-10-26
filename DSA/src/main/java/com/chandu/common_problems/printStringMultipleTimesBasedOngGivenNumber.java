package com.chandu.common_problems;

import java.util.Scanner;

public class printStringMultipleTimesBasedOngGivenNumber {

    public static void toPrintNoOfTimes(String s, int num){

        for(int i=0; i<num; i++){
            System.out.println(s);
        }

    }


    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s1 = sc.nextLine();
        System.out.println("enter a num to how many times to print");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            System.out.println(s1);
        }*/

        //or by doing in method

        //by using object
//        printStringMultipleTimesBasedOngGivenNumber nn = new printStringMultipleTimesBasedOngGivenNumber();
//        nn.toPrintNoOfTimes("chandu",4);


        //this is using static method
        toPrintNoOfTimes("sindhu",7);

    }


}
