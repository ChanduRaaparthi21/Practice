package rcd;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class TestMe extends SimpleTagSupport
{
    public void doTag() throws JspException,IOException
    {
        JspContext c = getJspContext();
        JspWriter out = c.getOut();
        out.println("welcome to my world");
    }
}