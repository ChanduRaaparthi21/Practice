import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class reguser extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
        response.setContentType("text/html");

        try{

            //extract and save into variables
           String name = request.getParameter("name");
           String contact = request.getParameter("contact");
           String email = request.getParameter("email");
           String address = request.getParameter("addr");
           String passsword = request.getParameter("pwd"); //ikkada password lo sss ichanu bcz password anedhi inkoti vasthadhi so atla ichahnu endhukante same name tho two undakudadhu

            //database code in store in users table of mystore database
            String driver = "com.mysql.cj.jdbc.Driver";
            String url ="jdbc:mysql://localhost:3306/mystore";
            String username = "root";
            String password = "chandu242638";

            //step 1 Register the Driver
            Class.forName(driver);

            //step 2 get the connection
            Connection con = DriverManager.getConnection(url, username, password);

            //step 3 create the statement object
            String qry = "insert into users(name,contact,email,address,password) values(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry);

            stmt.setString(1, name);
            stmt.setString(2, contact);
            stmt.setString(3, email);
            stmt.setString(4, address);
            stmt.setString(5, passsword);

            //step 4 execute the query
            stmt.executeUpdate();

            //step 5 close the connection
            con.close();



            //display response
            PrintWriter out = response.getWriter();
            
            out.println("<h1>User Registration Successfully.</h1>");
            out.println("<h1><a href=\"/login\">Login Now</a></h1>");

          }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}