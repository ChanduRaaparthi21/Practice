
class A {

   public int add(int n1, int n2) {

       return n1 + n2;

}
}

class B extends A{

   public int add(int n1, int n2) {

      return n1 + n2;
   }

}






public class MethodOverriding{

    public static void main(String[] args) {

      B a = new B();
    int r1=  a.add(5, 5);
System.out.println(r1); //prints 10
}
}