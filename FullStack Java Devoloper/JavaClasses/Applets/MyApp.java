//program to demonstrate applet
import java.applet.*;
import java.awt.*;

public class MyApp extends Applet
{
	
	String msg="";
	public void init()
	{
		setBackground(Color.blue);
		setForeground(Color.white);
		msg+="int--->";
		
		this.add(new Label("telugu web guru"));
		this.add(new Button("click me"));
		
	}
	
	public void start()
	{
		msg+="start--->";
	}
	public void stop()
	{
		msg+="stop--->";
	}

	public void destroy()
	{
		msg+="destroy";
		
	}
	  
	public void paint(Graphics g)
	{
	    g.drawLine(30, 60, 500, 250);
	    g.drawString(msg, 100, 200);
	}
}