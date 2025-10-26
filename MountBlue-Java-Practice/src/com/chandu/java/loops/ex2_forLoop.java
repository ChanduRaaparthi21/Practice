package com.chandu.java.loops;

public class ex2_forLoop {

    public static void main(String[] args) {

        for (int i =1; i<=20; i++){

            System.out.println(i+" Hello");
        }




        //this way also we write the for loop
        int j;
        for( j=1; ;){
            if(j<=10){
                System.out.println(j+" hi");
                j++;
            }else
                break;
        }
        System.out.println(j);
    }
}
