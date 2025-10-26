package com.chandu.java.Arrays.multiDimansionalArray;

public class twoDimensional {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];

        arr[0][0]=1;
        arr[0][1]=2;

        arr[1][0]=3;
        arr[1][1]=4;

        arr[2][0]=5;
        arr[2][1]=6;

        //print array elements
        for (int i=0; i<arr.length;i++){
            for (int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //print size of an array
        int size=0;
        for (int k=0; k<arr.length;k++){
            size = size+arr[k].length;
        }
        System.out.println("size of an array "+size);


    }
}
