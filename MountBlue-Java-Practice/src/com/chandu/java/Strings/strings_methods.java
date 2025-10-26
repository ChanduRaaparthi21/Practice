package com.chandu.java.Strings;

public class strings_methods {

    public static void main(String[] args) {

        //String methods


       /* 1. Concat()
        2. charAt()
        3.length()
        4.compareTo()
        5.comapreIgnoreCase()
        6.equals()
        7.equalsIgnoreCase()
        8.startsWith()
        9.endsWith()
        10.indexOf()
        11.lastIndexOf()
        12.replace()
        13.replaceAll()
        14.subString(int )
        15.subString(int1,int2)
        16.toLowerCase()
        17.toUpperCase()
        18.trim()
        19.split()
        20.void getChars(int1,int2,char[],int3)
        21.contains()
        22.toCharArray()
        23.valueOf()
        24.isEmpty()
        25.isBlanck()
    */


/*//1 --> two strings ni add chesthundhi
        String s1 = "Chandu";
        String s2 = "Raparthi";

        String s3 = s1.concat(" "+s2);
        System.out.println(s3); //output : Chandu Raparthi
        */




/*

        //2 --> manam index value isthe aa postion lo unna character return chesthundhi

        String s1 = "Chandu Raparthi";

        char s2 = s1.charAt(8);
        System.out.println(s2); //output : a

*/




     /*   //3--> string length return chesthundhi

        String s1 = "Hi Hello Welcome, namasthe";
        int s2 = s1.length();
        System.out.println(s2); //op : 26


*/

        /*//4 --> comare two string based on asci value, lower case ki ascii value +ve untundhi, upper case ki -ve untadhi

        String s1 = "Chandu";
        String s2 = "chandu";

        System.out.println(s2.compareTo(s1));*/




  /*      //5 --> comare two string based on asci value, lower case ki ascii value +ve untundhi, upper case ki -ve untadhi

        String s1 = "Chandu";
        String s2 = "Chandu";

        System.out.println(s2.compareToIgnoreCase(s1));
*/



       /* //6 and 7

        String s1= "Chandu";
        String s2 = "chandu";
        boolean s3 = s1.equals(s2);
        boolean s4 = s1.equalsIgnoreCase(s2);
        System.out.println(s3); // false
        System.out.println(s4); //true
        */




        /*//8 and 9


        String s1 = "Hi chandu, how are you";

        boolean s2 = s1.startsWith("Hi");
        boolean s3 = s1.endsWith("kji");
        System.out.println(s2);
        System.out.println(s3);
        */



        //10 , 11

      /*  String s1 = "chandu chandu";

        int s2 = s1.indexOf("c");
        int s3 = s1.lastIndexOf("c");
        System.out.println(s2); //0
        System.out.println(s3); //7

*/



        //12,13

      /*  String s1 = "hi chandu";

        String s2 = s1.replace("hi","Hello");
        String s3 = s1.replaceAll("hi chandu","CHANDU RAPARTHI");
        System.out.println(s2);
        System.out.println(s3);
*/




/*
//14, 15


        String s1 = "Chandu Raparthi";

        String s2 = s1.substring(2);
        String s3 = s1.substring(3,6);
        System.out.println(s2);
        System.out.println(s3);
*/





     /*   //16,17

        String s1 = "chandu";
        String s2= "RAPARTHI";

        String s3 = s1.toUpperCase();
        String s4 = s2.toLowerCase();

        System.out.println(s3);
        System.out.println(s4);
*/



    /*    //18

        String s1 = "  chandu raparthi ";
        System.out.println(s1.length());

        System.out.println(s1.trim().length());
*/



      /*  //19

        String s1= "c han du rapa rthi";

        String res[] = s1.split(" ");

        System.out.println(s1.length());

        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }*/



       /* //21

        String s1 = "chandu";
        System.out.println(s1.contains("a"));*/




     /*  //22

        String s1 = "chandu";

        char[] ch = s1.toCharArray();

        for(int i=0; i<ch.length;i++){
            System.out.println(ch[i]);
        }
*/



/*
//23
        String s1 = "123";

        int s2 = Integer.valueOf(s1);
        System.out.println(s2);

        int s3 = 123;

        String s4 = String.valueOf(s3);
        System.out.println(s4);
*/



        /*//24,25

        String s1 ="";
        String s2 ="   ";
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());


*/
    }
}
