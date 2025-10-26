//program to demonstrate sqi injection with Prepared statement ( user nundi data enter chepinchukuni data base save avvadam)
//setpath : c drivr lo programingfile lo (C:\Program Files (x86)\MySQL\Connector J 8.0 lo mysql-connector-java-8.0.30.jar dhanini manam chese java file unna folder loki copy chesukuni :- commond prompt lo mana java file compile chesina tharuvatha set classpath=%classpath% ani file name ni past cheyyali(Connector J 8.0 lo mysql-connector-java-8.0.30.jar)

import java.sql.*;
import java.io.*;

class sqlinjectionPstmt{
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
String qry = "select balance from bankbalance where username=? and password=?";

PreparedStatement stmt = con.prepareStatement(qry); //prepared statemet vadatam valla secure ga untadhi (' or 1=1 -- ') idhi use chesina hack avvadhu  
stmt.setString(1, uname);
stmt.setString(2, pwd);

//4.Execute the Queries


ResultSet rs = stmt.executeQuery();

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


