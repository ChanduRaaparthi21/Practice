class chandu {

   public void playmusic() {

      System.out.println("Playing music...");

   }

   public String byingPen(int price) {

      if (price >= 10) {
         return "pen  is bought";
      } else {
         return "minimum price is 10 or  more";
      }

   }

}

public class methods {
   public static void main(String[] args) {

      // creating object of the class

      chandu obj = new chandu();

      obj.playmusic();
      String result = obj.byingPen(20);
      System.out.println(result);
      

   }
}
