package org.example;
import java.sql.*;
import java.util.Scanner;


public class preparedStatements {

    public static void main(String[] args) throws Exception {

        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pswd = "chandu242638";




/*
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
        *//*ResultSet rs = stmt.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("name of the student "+name);

        while (rs.next()){
            System.out.print(rs.getInt(1) +" - ");
            System.out.print(rs.getString(2)+" - ");
            System.out.print(rs.getInt(3));
            System.out.println();
        }*//*

        // for inserting
        boolean status = stmt.execute(sql);
        System.out.println(status);

        System.out.println("connection closed");
        con.close();


        */


        //preparedStatements

        Scanner sc = new Scanner(System.in);

        System.out.println("enter sid");
        int sid = sc.nextInt();

        System.out.println("enetr sname");
        String sname = sc.next();

        System.out.println("enter smarks");
        int smarks = sc.nextInt();


//        int sid=101;
//        String sname="Johmn";
//        int smarks = 34;

        String sql = "insert into student values(?,?,?)";

        Connection con = DriverManager.getConnection(url,uname,pswd);

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,sid);
        ps.setString(2,sname);
        ps.setInt(3,smarks);

        ps.execute();








    }
}