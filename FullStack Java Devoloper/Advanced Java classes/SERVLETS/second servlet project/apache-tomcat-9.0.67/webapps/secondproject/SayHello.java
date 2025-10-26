import javax.servlet.http.*;
import java.io.*;

public class SayHello extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
        try{
        PrintWriter out = response.getWriter();
        out.println("<html><h1>Hello</h1></html>");
        }
        catch(Exception e){}
    }
}