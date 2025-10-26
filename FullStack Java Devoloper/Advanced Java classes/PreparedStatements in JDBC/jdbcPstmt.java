//program to demonstrate prepared Statement in jdbc ( user nundi data enter chepinchukuni data base save avvadam)
//setpath : c drivr lo programingfile lo (C:\Program Files (x86)\MySQL\Connector J 8.0 lo mysql-connector-java-8.0.30.jar dhanini manam chese java file unna folder loki copy chesukuni :- commond prompt lo mana java file compile chesina tharuvatha set classpath=%classpath% ani file name ni past cheyyali(Connector J 8.0 lo mysql-connector-java-8.0.30.jar)

import java.sql.*;
import java.io.*;

class jdbcPstmt{
public static void main(String[] args) {
        
   String driver = "com.mysql.cj.jdbc.Driver";
   String url = "jdbc:mysql://localhost:3306/college";
   String username = "root";
   String password = "chandu242638";

    try{

        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);

        System.out.println("Please enter your rllno");
        String rno = b.readLine();

        System.out.println("Please enter your name");
        String name = b.readLine();

        System.out.println("please entere your class");
        String classu = b.readLine(); //class ani rasthe error chupisthundhi so classu ani ichha ....no problem




//1.Register the Driver
Class.forName(driver);

//2.Get the Connection
Connection con = DriverManager.getConnection(url, username, password);

//3.Create the statement Objetc
String qry = "insert into student values(?,?,?)";
PreparedStatement stmt = con.prepareStatement(qry);

stmt.setInt(1,Integer.parseInt(rno));
stmt.setString(2, name);
stmt.setString(3, classu);

//4.Execute the Queries


stmt.executeUpdate();

//5.Close the Connection
con.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    }


