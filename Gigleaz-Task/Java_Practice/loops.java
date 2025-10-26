public class loops {
   public static void main(String[] args) {

      // //1.While loop
      // int i = 1;
      // while (i <= 10) {
      // System.out.println("hello " + i);

      // // nested while loop start here and
      // int j = 1;
      // while (j <= 5) {
      // System.out.println("hi" + j);
      // j++;
      // }

      // i++;
      // // nested while loop ended here
      // }

      // 2.do-while loop---------------------------------------------------
      // int i =5;

      // do{

      // System.out.println("Hello "+i);

      // }while(i<=4);

      // 3.for loop------------------------------------------------------------------

      for (int i = 1; i <= 5; i++) {
         System.out.println("Day " + i);

         for (int j = 1; j <= 9; j++) {
            System.out.println(" " + (j + 8) + " - " + (j + 9));
         }

      }

   }
}
