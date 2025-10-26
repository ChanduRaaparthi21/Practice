//program to demonstrate sqi injection ( user nundi data enter chepinchukuni data base save avvadam)
//setpath : c drivr lo programingfile lo (C:\Program Files (x86)\MySQL\Connector J 8.0 lo mysql-connector-java-8.0.30.jar dhanini manam chese java file unna folder loki copy chesukuni :- commond prompt lo mana java file compile chesina tharuvatha set classpath=%classpath% ani file name ni past cheyyali(Connector J 8.0 lo mysql-connector-java-8.0.30.jar)

import java.sql.*;
import java.io.*;

class injectionex1{
public static void main(String[] args) {
        
   String driver = "com.mysql.cj.jdbc.Driver";
   String url = "jdbc:mysql://localhost:3306/sqlinjectionone";
   String username = "root";
   String password = "chandu242638";

    try{

        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);

        System.out.println("Please enter your username");
        String uname = b.readLine();

        System.out.println("Please enter your pasword");
        String pwd = b.readLine();





//1.Register the Driver
Class.forName(driver);

//2.Get the Connection
Connection con = DriverManager.getConnection(url, username, password);

//3.Create the statement Objetc
Statement stmt = con.createStatement();

//4.Execute the Queries
String qry = "select balance from bankbalance where username='"+uname+"' and password='"+pwd+"'";
System.out.println("our Query is :"+qry);

ResultSet rs = stmt.executeQuery(qry);

if(rs.next())
{
  System.out.println("balance is :"+rs.getDouble(1));  
}
else{
    System.out.println("please check ur username and password");
}
//5.Close the Connection
con.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    }


