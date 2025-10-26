interface A {

   int age = 45;

   void show();

   void display();

}

class B implements A {

   public void show() {

      System.out.println("In show method");
   }

   public void display() {
      System.out.println("In display method");

   }

}

public class Interfaces {

   public static void main(String[] args) {

      B obj = new B();
      obj.show();
      obj.display();

   }

}
