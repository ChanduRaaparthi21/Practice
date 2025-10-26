import javax.servlet.http.*;
import java.io.*;

public class SayWelcome extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
        try{
        PrintWriter out = response.getWriter();
        out.println("<html><h1>Welcome</h1></html>");
        }
        catch(Exception e){}
    }
}