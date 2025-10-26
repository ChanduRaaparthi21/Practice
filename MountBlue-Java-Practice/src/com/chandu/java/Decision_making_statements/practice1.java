package com.chandu.java.Decision_making_statements;

public class practice1 {

    public static void main(String[] args) {

        String examStatus="pass";

        if(examStatus=="pass"){
            System.out.println("u have main entrance exam");
            String round1="pass";
            if(round1=="pass"){
                System.out.println("u passed round1");
                String round2="pass";
                if(round2=="pass"){
                    System.out.println("u passed round2");
                }
            }
        } else {
            System.out.println("u have failed round");
        }






    }
}
