package com.chandu.java.variables;

//A variable is a container which holds the value while the java program is executed
   /*
    types of variables
    1.local variables --> 2 types
        1.1. local variables
         1.2. parameters

    2.global variables---> 2 types
           2.1.instance variables (Non-static fields)
           2.2.class variables (Static fields)



           --> method rasetappude values isthe vaatini parameters antamu (only defined)
           --> method lopala raasthe vatini local variables antamu (both initialized and defined)


           */
public class TypesOfVariables {

    //small program for students
  static   int sutendtId = 104; //instance variables (ivi class lopala undali method lopala kaadhu)
    static int classId = 105; //class variables (ivi class lopala undali method lopala kaadhu) static ane keyword use chesthamu
String name = "chandu";

    public static void main(String[] args) {

        TypesOfVariables sutendt = new TypesOfVariables();
        System.out.println(sutendt.sutendtId);
        System.out.println("static variable "+classId);
        sutendt.test1();
        System.out.println("student name "+sutendt.name);
        int studentHeight = 70; //local varibale
        System.out.println("studnet height "+studentHeight);
        parameterVariable(60);
    }

    //static variables ki object create cheyyakkarledhu
    public static void test1(){
        System.out.println(sutendtId);
    }

    public static void parameterVariable(int studentWeight){
        System.out.println("student weight "+studentWeight);
    }

}
