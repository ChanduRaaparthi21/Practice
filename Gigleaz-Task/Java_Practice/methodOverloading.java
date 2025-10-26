class calculator {

   public int add(int a, int b, int c) {
      return a + b + c;
   }

   public int add(int a, int b) {
      return a + b;
   }

}

public class methodOverloading {
   public static void main(String[] args) {

      calculator obj = new calculator();

      int result = obj.add(43, 46);
      System.out.println(result);

   }
}
