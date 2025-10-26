package com.chandu.patterns;

class BoxMuggu {
  public static void main(String[] args) {
    // for(int i=0;i<5;i++){
    // for(int j=0;j<5;j++){
    // System.out.print("*");
    // if(j<=3){
    // System.out.print("_");
    // }
    // }
    // System.out.println();
    // }



    // // 2nd
    // for (int i = 0; i < 3; i++) {
    //   for (int j = 0; j < 14; j++) {
    //     System.out.print("*");
    //     if (j < 13) {
    //       System.out.print("_");
    //     }
    //   }
    //   System.out.println();

    // }




        // // 3rd
        // for (int i = 0; i < 14; i++) {
        //   for (int j = 0; j < 3; j++) {
        //     System.out.print("*");
        //     if (j < 2) {
        //       System.out.print("_");
        //     }
        //   }
        //   System.out.println();
    
        // }


        // // 4th
//         int n=3; 
//         int p=4;
//         for(int i=0; i<n; i++) {
//           for(int j=0; j<p; j++){
//             if(i==0 || i==n-1 || j==0 || j==p-1)
//             System.out.print("*"); 
// else
// System.out.print(" ");
//         }
//         System.out.println();
//   }









// 5th
int n=5;
for(int i=0; i<n; i++) {
for(int j=0; j<n-i; j++){
  System.out.print(" ");
}
for(int k=0; k<3; k++){
  System.out.print("*"); 
}
System.out.println();
}
}
}