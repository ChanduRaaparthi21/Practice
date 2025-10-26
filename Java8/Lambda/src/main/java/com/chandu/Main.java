package com.chandu;

public class Main {
    public static void main(String[] args) {

     /*   //brfoer using lambda
       UserService userService = new UserService();
       System.out.println(userService.getName());*/

        //after using lambda

        UserInterface us = ()->"chandu";
        System.out.println(us.getName());

    }
}