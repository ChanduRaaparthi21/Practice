package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception{

        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pswd = "chandu242638";

        //retrieving
//        String sql= "Select * from student";
//        String sql = "select sname from student where sid=1";
        //insterting data
//        String sql = "insert into student values (5,'chuchu',87)";
        //update
//        String sql = "update student set sname='Max' where sid=4";
        //delete
        String sql = "delete from student where sid=5";


//        Class.forName("org.postgresql.Driver"); //no need this

        Connection con = DriverManager.getConnection(url,uname,pswd);
        System.out.println("Connected");

        Statement stmt = con.createStatement();
        /*ResultSet rs = stmt.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("name of the student "+name);

        while (rs.next()){
            System.out.print(rs.getInt(1) +" - ");
            System.out.print(rs.getString(2)+" - ");
            System.out.print(rs.getInt(3));
            System.out.println();
        }*/

        // for inserting
        boolean status = stmt.execute(sql);
        System.out.println(status);

        System.out.println("connection closed");
        con.close();


    }
}