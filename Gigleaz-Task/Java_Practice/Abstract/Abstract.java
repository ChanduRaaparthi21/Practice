package Abstract;

abstract class CGovt {

   public void OtherActionstobeTaken() {

      System.out.println("Thats state  action");
   }

   abstract void actionsToBeTaken(); // Abstract method to be implemented by the subclasses

}

class Ap extends CGovt {

   public void apActions() {
      System.out.println("Inside AP Actions");
   }

   void actionsToBeTaken() {
      System.out.println("im from AP actionsToBeTaken");
   }

}

class Tg extends CGovt {

   public void tgActions() {
      System.out.println("form tg actions");
   }

   void actionsToBeTaken() {
      System.out.println("im from TG actionsToBeTaken");
   }
}

class Abstract {

   public static void main(String[] args) {

      Tg tg = new Tg();
      tg.OtherActionstobeTaken();
      tg.actionsToBeTaken();

      Ap ap = new Ap();
      ap.OtherActionstobeTaken();
      ap.actionsToBeTaken();

   }

}