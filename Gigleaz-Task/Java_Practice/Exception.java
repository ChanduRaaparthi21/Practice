public class Exception {
   public static void main(String[] args) {

      // ---------------------------------------------------------------------------------
      // try_catch
      // single line try catch block
      // int i = 4;
      // int j = 0;

      // try {
      // j = 18 / 0;
      // } catch (java.lang.Exception e) {
      // System.out.println("An error occurred : "+e);
      // }

      // System.out.println(j);
      // System.out.println("Hello");

      // ---------------------------------------------------------------------------------
      // try_catch_finally
      // System.out.println("Program start");
      // int fNumber = 9;
      // int sNumber = 0;
      // int tNumber = 6;

      // int result;

      // try {
      //    result = fNumber / sNumber;
      // } catch (java.lang.Exception e) {
      //    e.printStackTrace();
      // } finally {
      //    System.out.println("this is finally block");
      // }

      // System.out.println(tNumber);
      // System.out.println("program ended");

      // ---------------------------------------------------------------------------------

      //throw_throws

      System.out.println("Program start");
      int fNumber = 9;
      int sNumber = 0;
      int tNumber = 6;

      int result;

      try {
         result = fNumber / sNumber;
      } catch (java.lang.Exception e) {
         e.printStackTrace();
         throw e; // dhini tharuvatha code execute avvadhu manam forceble ga java ki chepthunnam idhi cricticle exception so excution stop chesey but finally anedhi excute avuthadhi
      } finally 
       {
         System.out.println("this is finally block");
      }

      System.out.println(tNumber);
      System.out.println("program ended");

   }
}