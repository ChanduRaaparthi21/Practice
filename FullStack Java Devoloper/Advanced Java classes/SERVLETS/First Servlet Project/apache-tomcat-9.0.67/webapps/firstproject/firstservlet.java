//program to demonstrate first servlet


import javax.servlet.http.*;
import java.io.*;

public class firstservlet extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
        try{
            //PrintWriter Object
            PrintWriter out = response.getWriter();

            //create responce
            out.println("welcome to my first servlet");

        }
        catch(Exception e){}
    }
}