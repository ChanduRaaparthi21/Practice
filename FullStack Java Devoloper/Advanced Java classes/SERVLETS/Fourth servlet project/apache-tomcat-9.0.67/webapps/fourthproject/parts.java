import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class parts extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
        response.setContentType("text/html");
        try{

            //extract and save from input into variablres
            String partname = request.getParameter("pname");
            String partwork = request.getParameter("pwork");
       
            //implement database connectivity


            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/bikeparts";
            String username = "root";
            String password = "chandu242638";
         
                  
         //1.Register the Driver
         Class.forName(driver);
         
         //2.Get the Connection
         Connection con = DriverManager.getConnection(url, username, password);
         
         //3.Create the statement Objetc
         String qry = "insert into parts values(?,?)";
         PreparedStatement stmt = con.prepareStatement(qry);
         
       
         stmt.setString(1, partname);
         stmt.setString(2, partwork);
        

         
         //4.Execute the Queries
         stmt.executeUpdate();
         
         //5.Close the Connection
         con.close();


            //send success response to user
            PrintWriter out = response.getWriter();
            out.println("part name :"+partname);
            out.println("<br/><br/>part work:"+partwork);
           

            out.println("<br/><br/><h1>parts Successfully submited</h1>");

            out.println("<br/><a href=\"./parts.html\">Add More parts</a>");
        }
        catch(Exception e)
        {
            System.out.println("error is :"+e);
        }
    }
}