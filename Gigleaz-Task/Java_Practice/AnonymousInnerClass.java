
class A {

   public void show(){

      System.out.println("A");

   }

}


public class AnonymousInnerClass {
   public static void main(String[] args) {
      
      A obj = new A()
      {
         public void show(){
            System.out.println("New");
         }
      };
      obj.show();

   }
}
