//program to demonstrate Data Retrieve from database
//setpath : c drivr lo programingfile lo (C:\Program Files (x86)\MySQL\Connector J 8.0 lo mysql-connector-java-8.0.30.jar dhanini manam chese java file unna folder loki copy chesukuni :- commond prompt lo mana java file compile chesina tharuvatha set classpath=%classpath% ani file name ni past cheyyali(Connector J 8.0 lo mysql-connector-java-8.0.30.jar)

import java.sql.*;

class ResultEx{
public static void main(String[] args) {
        
   String driver = "com.mysql.jdbc.Driver";
   String url = "jdbc:mysql://localhost:3306/college";
   String username = "root";
   String password = "chandu242638";

    try{
//1.Register the Driver
Class.forName(driver);

//2.Get the Connection
Connection con = DriverManager.getConnection(url, username, password);

//3.Create the statement Objetc
Statement stmt = con.createStatement();

//4.Execute the Queries
ResultSet res = stmt.executeQuery("select * from student");

while(res.next())
{
    System.out.print(res.getInt("rno")+" "+res.getString("name")+" "+res.getString("class"));
    System.out.println();
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

