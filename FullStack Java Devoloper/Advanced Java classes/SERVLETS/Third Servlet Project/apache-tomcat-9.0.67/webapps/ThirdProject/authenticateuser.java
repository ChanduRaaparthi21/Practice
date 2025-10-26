import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class authenticateuser extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
        response.setContentType("text/html");

        try{
            PrintWriter out = response.getWriter();

            //extract and save into variables
         
           String email = request.getParameter("email");
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
            String qry = "select * from users where email=?";
            PreparedStatement stmt = con.prepareStatement(qry);

            stmt.setString(1, email);
            

            //step 4 execute the query
             ResultSet rs = stmt.executeQuery();

             if(rs.next())
             {
                //compare database paswd with user enterd pswd
              String dbpwd =  rs.getString("password");
             if(passsword.equals(dbpwd))
             {
               //forword the user to the products page
               response.sendRedirect("./product.html");

             }
             else
             {
                out.println("<h1>user credentials are incorrect</h1>");
             }


             }
             else
             {
                out.println("<h1>user does not exist</h1>");
             }

            //step 5 close the connection
            con.close();

       

          }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

} 