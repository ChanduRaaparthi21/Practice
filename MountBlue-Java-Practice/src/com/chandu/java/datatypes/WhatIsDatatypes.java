package com.chandu.java.datatypes;

public class WhatIsDatatypes {

    //Datatype means that one variable Hold or Contains which type of value in the variable
    //Datatypes can be divided into 2 categories
    //1.Primitive Datatypes
    //2.Non-Primitive Datatypes

    //Primitive Datatypes (Numeric Datatypes,Boolean Datatypes, Character Datatypes)
    //Integer type
    //1.byte
    //2.short
    //3.int
    //4.long

    //Decimal type
    //5.float
    //6.double

    //7.char
    //8.boolean


    //Non-Primitive Datatypes
    //1.Arrays
    //2.Classes
    //3.Interfaces
    //4.Enums

    //wrapper type (Starts with Capital letter)
    //1.Byte
    //2.Short
    //3.Integer
    //4.Long
    //5.Float
    //6.Double
    //7.Character
    //8.Boolean
    //9.String


    public static void main(String[] args) {

        byte b = 13;
        short s = 250;
        int i = 244545544;
        long l = 7731974152L; //mention L after Number
        float f = 23.45f;
        double d = 23.45;
        char c = 'a';
        boolean bool = true;
        String str = "Hello World";


        //to know the datatype memory size for that we use Wrapper type it gives bits format to convert bytes by using division by 8
        System.out.println("size of Byte "+Byte.SIZE/8+" bytes");
        System.out.println("size of Short "+Short.SIZE/8+" bytes");
        System.out.println("size of in t"+Integer.SIZE/8+" bytes");
        System.out.println("size of long "+Long.SIZE/8+" bytes");
        System.out.println("size of float "+Float.SIZE/8+" bytes");
        System.out.println("size of Double "+Double.SIZE/8+" bytes");
        System.out.println("size of character "+Character.SIZE/8+" bytes");



        //find the range of each datatype

        System.out.println("byte range "+Byte.MIN_VALUE+ " to "+Byte.MAX_VALUE);
        System.out.println("short range "+Short.MIN_VALUE+ " to "+Short.MAX_VALUE);
        System.out.println("int range "+Integer.MIN_VALUE+ " to "+Integer.MAX_VALUE);
        System.out.println("long range "+Long.MIN_VALUE+ " to "+Long.MAX_VALUE);
        System.out.println("float range "+Float.MIN_VALUE+ " to "+Float.MAX_VALUE);
        System.out.println("double range "+Double.MIN_VALUE+ " to "+Double.MAX_VALUE);
        System.out.println("char range "+Character.MIN_VALUE+ " to "+Character.MAX_VALUE);







    }


}
