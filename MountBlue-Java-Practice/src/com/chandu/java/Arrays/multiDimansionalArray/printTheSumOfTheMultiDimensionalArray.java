package com.chandu.java.Arrays.multiDimansionalArray;

import java.util.Scanner;

public class printTheSumOfTheMultiDimensionalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("give the no of rows");
        int rows = sc.nextInt();
        System.out.println("give the  no of columns");
        int clms = sc.nextInt();

        int[][] array = new int[rows][clms];

        System.out.println("enter the elements of the array");
        for(int i=0; i<rows;i++){
            for(int j=0; j<clms; j++){
                array[i][j]=sc.nextInt();
            }
        }
int sum=0;
        for(int i=0; i<rows;i++){
            for(int j=0; j<clms;j++){
                sum = sum+array[i][j];


            }

        }
        System.out.println(sum);
    }

}
