import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;


public class SayHello extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
        response.setContentType("text/html");
        try{

            //get servletconfig parameters from xml
            ServletConfig config = getServletConfig();
            String name = config.getInitParameter("nm");


        PrintWriter out = response.getWriter();

        String msg = "<h1>Hello "+name+"</h1>";
        out.println(msg);
        }
        catch(Exception e){}
    }
}