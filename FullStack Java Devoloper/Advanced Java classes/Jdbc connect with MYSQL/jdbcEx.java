//program to demonstrate Jdbc with connecting mysql
//setpath : c drivr lo programingfile lo (C:\Program Files (x86)\MySQL\Connector J 8.0 lo mysql-connector-java-8.0.30.jar dhanini manam chese java file unna folder loki copy chesukuni :- commond prompt lo mana java file compile chesina tharuvatha set classpath=%classpath% ani file name ni past cheyyali(Connector J 8.0 lo mysql-connector-java-8.0.30.jar)

import java.sql.*;

class jdbcEx{
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
stmt.executeUpdate("insert into student values(1,'chandu','firstclass')");
stmt.executeUpdate("insert into student values(2,'vani','secondclass')");
stmt.executeUpdate("insert into student values(3,'pavan','fourthclass')");
stmt.executeUpdate("insert into student values(4,'sai','ukgclass')");
stmt.executeUpdate("insert into student values(5,'chandana','ninthclass')");

//5.Close the Connection
con.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    }


