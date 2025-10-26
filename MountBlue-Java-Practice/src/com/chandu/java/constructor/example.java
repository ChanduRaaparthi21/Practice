package com.chandu.java.constructor;
 class chandu{
     String fullName;
     long age;
     long mobileNumber;
     public chandu(){
         fullName="Chandu Raparthi";
         age=22;
         mobileNumber=2323233;
     }
}
class chandu1{
    String fullName;
    long age;
    long mobileNumber;
    public chandu1(){
        fullName="Chandu Raparthi";
        age=22;
        mobileNumber=2323233;
    }
}
public class example {
    public static void main(String[] args) {

        chandu username = new chandu();
        String user = username.fullName;
        long age = username.age;
        long mbl= username.mobileNumber;
        System.out.println(user+" "+age+" "+mbl);

        chandu1 uu = new chandu1();
        String usere = uu.fullName;
        long agee = uu.age;
        long mble= uu.mobileNumber;
        System.out.println(usere+" "+agee+" "+mble);

    }
}
