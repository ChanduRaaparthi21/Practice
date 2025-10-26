package com.chandu.java.Arrays.sigleDimansionalArray;

import java.util.Scanner;

public class mergeTwoArraysAndPrint {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size");
        int s1 = sc.nextInt();
        System.out.println("Enter first array elemnts ");
        int [] arr1 = new int[s1];
        for(int i =0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();

        }
        System.out.println("Enter second array size");
        int s2 = sc.nextInt();
        System.out.println("Enter second array");
        int []arr2 = new int[s2];
        for(int i = 0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int mArray [] = new int[arr1.length + arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            mArray[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            mArray[arr1.length+i]=arr2[i];
        }
        System.out.println("Hence the merged array is : ");
        for(int i =0;i<mArray.length;i++)
        {
            System.out.print(mArray[i]+" ");
        }

    }

}