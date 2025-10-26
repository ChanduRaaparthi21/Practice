package com.chandu.java.constructor;

public class constructorPractice {
    public int i;

    public static void main(String[] args) {
        //block of code, object create chesetappude call chesedhi constructor
        //methods kuda block of code eh but dhanini object create chesina tharuvatha call chesthamu..
        //constructor name same as class name
        //constructor have no return type

        constructorPractice cp = new constructorPractice(33);
        System.out.println(cp.i);
    }
    public constructorPractice(){
i=20;
    }

    public constructorPractice(int a){
        i=a;
    }


}
