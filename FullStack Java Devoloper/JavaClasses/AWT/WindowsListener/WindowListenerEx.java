//program to demonstrate windowlistener

import java.awt.*;
import java.awt.event.*;

class WindowListenerEx
{
	
	public static void main(String arr[])
	{
		
		//create the frame
		Frame f = new Frame("window listener example");
		f.setSize(400, 400);
		f.setVisible(true);
		
		//step2 add listener
		f.addWindowListener(new Mylistener());
		
	}
	
}
class Mylistener implements WindowListener
{
	
	//methods
	public void windowOpened(WindowEvent e) {System.out.println("opend");}
	
	 public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {System.out.println("closed");}
	
    public void windowIconified(WindowEvent e) {System.out.println("Iconified");}
    
    public void windowDeiconified(WindowEvent e) {System.out.println("DeIconified");}
    
    public void windowActivated(WindowEvent e){System.out.println("activated");}
    
    public void windowDeactivated(WindowEvent e){System.out.println("Deactivated");}




}
