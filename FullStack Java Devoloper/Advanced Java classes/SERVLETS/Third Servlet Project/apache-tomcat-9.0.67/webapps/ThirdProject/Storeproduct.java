import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Storeproduct extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
        response.setContentType("text/html");
        try{

            //extract and save from input into variablres
            String prodid = request.getParameter("pid");
            String prodname = request.getParameter("pname");
            String prodcat = request.getParameter("cat");
            int prodqty = Integer.parseInt(request.getParameter("qty"));

            //implement database connectivity


            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/mystore";
            String username = "root";
            String password = "chandu242638";
         
                  
         //1.Register the Driver
         Class.forName(driver);
         
         //2.Get the Connection
         Connection con = DriverManager.getConnection(url, username, password);
         
         //3.Create the statement Objetc
         String qry = "insert into products values(?,?,?,?)";
         PreparedStatement stmt = con.prepareStatement(qry);
         
       
         stmt.setString(1, prodid);
         stmt.setString(2, prodname);
         stmt.setString(3, prodcat);
         stmt.setInt(4, prodqty);

         
         //4.Execute the Queries
         stmt.executeUpdate();
         
         //5.Close the Connection
         con.close();


            //send success response to user
            PrintWriter out = response.getWriter();
            out.println("product ID :"+prodid);
            out.println("<br/><br/>product name :"+prodname);
            out.println("<br/><br/>product Category :"+prodcat);
            out.println("<br/><br/>product Quantity :"+prodqty);

            out.println("<br/><br/><h1>Product Insert Successfully...</h1>");

            out.println("<br/><a href=\"./product.html\">Add More product</a>");
        }
        catch(Exception e)
        {
            System.out.println("error is :"+e);
        }
    }
}