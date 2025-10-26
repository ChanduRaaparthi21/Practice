package com.chandu.java.loops;

import java.util.Scanner;

public class forEach {

    public static void main(String[] args) {

//        int[] arr = {2, 4, 2, 4, 5, 6,};
//        for (int c : arr) {
//            System.out.print(c+" ");
//        }

        Scanner sc  = new Scanner(System.in);

        System.out.println("no of rows");
        int rows = sc.nextInt();

        System.out.println("no of clms");
        int clms= sc.nextInt();

        int[][] arr= new int[rows][clms];

        System.out.println("enter nums");

        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //this is forach loop
        for(int[] row: arr){
            for(int clm : row){
                System.out.print(clm + " ");
            }
            System.out.println();
        }



    }
}
