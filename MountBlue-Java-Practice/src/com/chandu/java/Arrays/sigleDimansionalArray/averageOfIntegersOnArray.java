package com.chandu.java.Arrays.sigleDimansionalArray;

import java.util.Scanner;

public class averageOfIntegersOnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        int average=0;

        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
            average = average+arr[i];
        }
        System.out.println(average/arr.length);


    }
}
