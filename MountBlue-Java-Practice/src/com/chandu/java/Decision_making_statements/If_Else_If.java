package com.chandu.java.Decision_making_statements;

import java.util.Scanner;

public class If_Else_If {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String studentName = scanner.nextLine();
        System.out.println("Your name is " + studentName);
        System.out.println("Enter Your marks");
        int marks = scanner.nextInt();

      if(marks >90){
          System.out.println(studentName+" A+");
      }else if(marks>80){
          System.out.println("A");
      }else if(marks>=70){
          System.out.println("B");
      }else if(marks>=50){
          System.out.println("C");
      }else{
          System.out.println("Fail");
      }



    }

}
