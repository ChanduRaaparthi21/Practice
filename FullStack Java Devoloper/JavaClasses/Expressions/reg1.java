//program to demonstrate regular expressions in java

import java.util.regex.*;
class reg1{

       public static void main(String arr[])
       {
                 /* idhi antha rayakunda okka step lo rasey vachhu adhi 27 line nunchi

                         //define a pattern
         Pattern p = Pattern.compile("[rcd]");

         //perform matching operations

         String str="iam chandu raparthi";

         Matcher m =p.matcher(str);

         System.out.println("m.find() : "+m.find());//string lo rcd undha ledho chepthundhi true or false

         System.out.println("m.start() : "+m.start());//string lo ea index dhaggara nunchi start avthundho aa index chupisthundhi

         System.out.println("m.find(8) : "+m.find(8));//string lo 8 index tharuvatha nunchi rcd undha ledha ani check chesthundhi
   

         */
          boolean result = Pattern.matches("\\w+@\\w+[.]\\w+","chanduraparthi@gmail.com");
          System.out.println("result :"+result);


       }

          }