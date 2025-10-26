class constructorExample {

   // creating a constructor

   String name;

   public constructorExample() {

      name = "Im from constructor";

   }

}

public class constructor {

   public static void main(String[] args) {

      constructorExample obj = new constructorExample();

      System.out.println("This is from the main method. " + "and Im from " + obj.name);

   }

}
