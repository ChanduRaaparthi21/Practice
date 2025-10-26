//program to demonstrate keylistener,adapter,anonymous inner classes in java
import java.awt.*;
import java.awt.event.*;

class keylistenerex extends Frame
{
	TextArea ta1;
	String msg="";
	
	
	keylistenerex()
	{
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		ta1 = new TextArea("",10,25);
		ta1.addKeyListener(new KeyAdapter () {
		 
			public void keyPressed(KeyEvent e)
			{
				int code = e.getKeyCode();
				String kname = e.getKeyText(code);
				
				msg=code  +"-"+kname;
				repaint();
			}
			
		});
		this.add(ta1);
		
	}
	
	public void keyPressed(KeyEvent e)
	{
		int code = e.getKeyCode();
		String kname = e.getKeyText(code);
		
		msg=code  +"-"+kname;
		repaint();
	}
	
	
	
	public void paint(Graphics g)
	{
		g.drawString(msg,40,700);
	}
	
	public static void main(String arr[])
	{
		keylistenerex f = new keylistenerex();
		f.setSize(600, 500);
		f.setVisible(true);
		
		
	}
	
	
}