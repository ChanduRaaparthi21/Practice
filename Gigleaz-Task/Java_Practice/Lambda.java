
interface A {
   // void show(int i, int j);

   // ------------------------------------------------------------------------------------------------------------------------------

   int add(int i, int j);

}

public class Lambda {

   public static void main(String[] args) {

      // A obj = new A() {
      // // Implementing the method of interface using

      // public void show(){
      // System.out.println("In show");
      // }

      // };

      // istead of using above expression we simply use lambda expression is given
      // below

      // A obj = ( i, j) -> System.out.println("in Show : " +(i+j));

      // obj.show(4,6);

      // ------------------------------------------------------------------------------------------------------------------------------

      A obj = (i, j) -> i + j;

      int result = obj.add(5, 5);
      System.out.println(result);

   }

}
