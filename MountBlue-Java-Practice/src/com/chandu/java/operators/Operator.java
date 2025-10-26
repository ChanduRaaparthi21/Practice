package com.chandu.java.operators;


/*
operator is an symbol that performs operations on variables and values

types of operators are defined in the following table
*1.Arithmetic operators
*2.Relational operators
3.Logical operators
4.Bitwise operators
*5.Assignment operators
6.Ternary operators
*7.Unary operators
8.Special operators


*1.Arithmetic operators
+  addition operator
-  subtraction operator
*  multiplication
/  division
%  modulus




*2.Relational operators
>  greater than
<  less than
>=  greater than or equal to (less than or equal to greater than)
<=  less than or equal to (greater than or equal to less than)
==  equal to
!=  not equal to

*3.Logical operators or conditional
&&  and
||  or
!   not

*4.Bitwise operators
&  bitwise and
|  bitwise or
^  bitwise xor
~  bitwise not
<< bitwise left shift
>> bitwise right shift
>>> bitwise right shift with zero fill

*5.Assignment operators
=  assignment operator
+=  addition assignment operator
-=  subtraction assignment operator
*=  multiplication assignment operator
/=  division assignment operator
%=  modulus assignment operator
&=  bitwise and assignment operator
|=  bitwise or assignment operator
^=  bitwise xor assignment operator
<<= bitwise left shift assignment operator
>>= bitwise right shift assignment operator
>>>= bitwise right shift with zero fill assignment operator

*6.Ternary operators
condition? expression1 : expression2

*7.Unary operators
++  increment operator (post increment(i++) and pre increment(++i))
--  decrement operator
+  unary plus operator
-  unary minus operator
~  bitwise not operator
!  logical not operator

*8.Special operators
instanceof  operator ? operator : operator != operator != operator != operator != operator != operator != operator  != operator != operator != operator !=


 */
public class Operator {
    public static void main(String[] args) {


    int a = 20;
    int b = 10;


   /* //airthemetical operator
    System.out.println("addition operator : "+ (a+b));
    System.out.println("subtraction operator : "+ (a-b));
    System.out.println("multiplication operator : "+ (a*b));
    System.out.println("division operator : "+ (a/b)); //for cotient
    System.out.println("modulus operator : "+ (a%b)); //for reminder
*/



        /*

        //unary (increment) operator
        System.out.println(a); //20
        System.out.println(++a); //pre increment 21
        System.out.println(a++); //post increment 21
        System.out.println(a); //22

        //unary (decrement) operator
        System.out.println(b); // 10
        System.out.println(--b); //9
        System.out.println(b--); //9
        System.out.println(b); //8

         */


//        //Relational operators
//        System.out.println("a is equal to b ? "+ (a==b));
//        System.out.println("a is not equal to b? "+ (a!=b));
//        System.out.println("a is greater than b? "+ (a>b));
//        System.out.println("a is less than b? "+ (a<b));
//        System.out.println("a is greater than or equal to b? "+ (a>=b));
//        System.out.println("a is less than or equal to b? "+ (a<=b));



      //Conditional or logical operators
  //&& -- ante two conditions true or false avvali...
        /*
        TRUE TRUE = true;
        FALSE TRUE = false;
        TRUE FALSE = false;
        FALSE FALSE = false;
         */

//   || -- oka condition true aina chalu
        /*
        TRUE TRUE = true;
        FALSE TRUE = true;
        TRUE FALSE = true;
        FALSE FALSE = false;
         */

 //! -- true aithe flase ga convert chesthusndhi and like flase aithe true ga convert chesthundhi..
        /*
        TRUE = FLASE
        FALSE = TRUE
         */


//        System.out.println(a>b && a==b); //
//        System.out.println(a>b || a!=b); //
//        System.out.println(!(a<b && a==b)); //





////Assignment
//        int i = 10;
//        System.out.println(i+=10);
//        System.out.println(i-=10);
//        System.out.println(i*=10);
//        System.out.println(i/=10);
//        System.out.println(i%=10);



}

}
