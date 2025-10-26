public class conditionalStatements {
   public static void main(String[] args) {

      // int a = 30;

      // if(a>20){

      // System.out.println("Hello Good morning! Im here because a is greater than
      // 20");
      // }else{

      // System.out.println("Hello Good morning! Im here because a is not greater than
      // 20");
      // }

      // int a = 21;
      // int b = 35;
      // int c = 40;

      // if(a > b && a < c){

      // System.out.println("Hello"+a);
      // }else if(b > a && b < c){
      // System.out.println("Good Morning!"+b);
      // }
      // else{
      // System.out.println(c);
      // }

      // int a = 10;
      // int result= 0;

      // result = n%2==0 ? 10 : 20;
      // System.out.println(result);

      // switch statements

      // int i = 4;

      // switch(i){

      // case 1:
      // System.out.println("sunday");

      // break;

      // case 2:
      // System.out.println("monday");

      // break;

      // case 3 :
      // System.out.println("Tuesday");
      // break;
      // case 4 :
      // System.out.println("Wednesday");
      // break;
      // case 5 :
      // System.out.println( "Thursday" );
      // break;
      // case 6 :
      // System.out.println("Friday");
      // break;
      // case 7 :
      // System.out.println( "Saturday" );
      // break;
      // default :
      // System.out.println( "Weekend" );

      // }

      // advanced switch statements

      String day = "saturday";

      String result = "";

      result = switch (day) {
         case "sunday" -> "8am";
         case "monday", "tuesday", "wednesday", "thurday" -> "6am";
         case "friday" -> "9";
         default -> "off";
      };

      System.out.println(result);

   }
}
