package com.chandu.patterns;

public class Triangle {

    public static void main(String[] args) {

        int n = 4;

//        for(int i=0; i<n; i++) {
//            for(int j=0; j<n-i-1; j++){
//                System.out.print(" ");
//            }
//            for(int j=0; j<2*i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //for reverse

//        for(int i=n-1; i>=0; i--) {
//            for(int j=0; j<n-i-1; j++){
//                System.out.print(" ");
//            }
//            for(int j=0; j<2*i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




//        for(int i=0; i<n; i++) {
//            for(int j=0; j<n-i-1; j++){
//                System.out.print(" ");
//            }
//            for(int k=0; k<2*i+1; k++){
//                if(k==0 || i==n-1 || k==2*i){
//                    System.out.print("*");
//                }else
//                System.out.print(" ");
//            }
//            System.out.println();
//        }




        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int k=i; k>=0; k--) {
                System.out.print(k+1+" ");
            }
            System.out.println();
        }
    }
}
