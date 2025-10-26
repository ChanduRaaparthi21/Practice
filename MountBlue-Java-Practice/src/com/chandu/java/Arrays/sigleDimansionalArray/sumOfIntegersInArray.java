package com.chandu.java.Arrays.sigleDimansionalArray;

import java.util.Scanner;

public class sumOfIntegersInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] userInput= new int[size];
int sum=0;
        for(int i=0; i<userInput.length; i++){
            userInput[i]= sc.nextInt();
            sum= sum+userInput[i];

        }
        System.out.print(sum);

    }

}
