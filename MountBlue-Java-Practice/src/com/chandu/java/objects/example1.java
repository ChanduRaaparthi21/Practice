package com.chandu.java.objects;

public class example1 {

    int i;
    int j;

    public example1(){
        i=20;
        j=23;
    }

    public example1(int i,int j){
        this.i=i;
        this.j=j;
    }
    public int add(){
        return i+j;
    }
    public static void main(String[] args) {

        example1 ex1 = new example1();
        example1 ex2 = new example1(23,43);
        example1 ex3 = new example1(22,22);

        System.out.println(ex1.add());
        System.out.println(ex2.add());
        System.out.println(ex3.add());
    }


}
