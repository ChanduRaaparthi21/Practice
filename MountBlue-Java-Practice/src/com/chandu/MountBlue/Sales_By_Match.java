package com.chandu.MountBlue;

import java.util.Arrays;
import java.util.Scanner;

public class Sales_By_Match {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


    }

}

//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Sales_By_Match {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements:");
//
//        int size = sc.nextInt();  // Read the number of elements
//        int[] userInput = new int[size];
//
//        System.out.println("Enter the elements:");
//        for (int i = 0; i < size; i++) {
//            userInput[i] = sc.nextInt();  // Read the elements into the array
//        }
//
//        Arrays.sort(userInput);  // Sort the array
//
//        int count = 1, pairs = 0;
//        for (int i = 0; i < userInput.length - 1; i++) {
//            if (userInput[i] == userInput[i + 1]) {
//                count++;
//            } else {
//                pairs += count / 2;
//                count = 1;
//            }
//        }
//        pairs += count / 2;  // For the last element sequence
//
//        System.out.println("Number of pairs: " + pairs);
//    }
//}






/*

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

class Result {

    */
/*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     *//*


    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        Collections.sort(ar);

        int count=1, pair=0;

        for(int i=0; i<ar.size()-1; i++){
            if (ar.get(i).equals(ar.get(i + 1))){
                count++;
            }
            else{
                pair =pair+count/2;
                count=1;
            }
            if(i==ar.size()-2){
                pair = pair+(count/2);
            }
        }


        return pair;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/

