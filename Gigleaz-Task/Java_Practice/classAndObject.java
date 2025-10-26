class human {

   // instance variables
   String name;
   int age;

   // instance methods
   void talking() {
      System.out.println(name + " is talking" + " and his age is " + age);
   }

   void eating() {

      System.out.println(name + " is eating mangos");
   }

}

public class classAndObject {

   public static void main(String[] args) {
      // creating object of the class
      human hmn = new human();

      //assign to instance variables
      hmn.name = "Chandu";
      hmn.age = 24;

      //assigning the values to instance methods
      hmn.eating();
      hmn.talking();
   }

}
