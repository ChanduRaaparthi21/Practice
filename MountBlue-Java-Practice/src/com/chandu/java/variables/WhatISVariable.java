package com.chandu.java.variables;

public class WhatISVariable {

    //A variable is a container which holds the value while the java program is executed

   /*
    types of variables
    1.local variables --> 2 types
        1.1. local variables
         1.2. parameters


    2.global variables---> 2 types
           2.1.instance variables (Non-static fields)
           2.2.class variables (Static fields)



           */

    public static void main(String[] args) {

        //only define the variable
        int pincode;
        //only initialize the variable
        pincode = 501201;
        pincode = 500000; // override the default value for pincode or reassigning
        System.out.println("my pincode : "+pincode);


        //varibale define and initialize
        long phoneNumber = 7731974152l;
        System.out.println("my phn number : "+phoneNumber);

    }
}
