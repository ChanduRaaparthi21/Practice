//program to demonstrarte graphic
import java.awt.*;
import java.awt.event.*;
class GraphicsEx extends Frame
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(120, 400, 350, 540);
		g.setColor(Color.blue);
		g.fillOval(340, 440, 350, 350);
		g.setColor(Color.green);
		Font fnt = new Font("Arial",Font.BOLD,40);
		g.setFont(fnt);
		g.drawString("chandu", 354, 610);
		
	}

   public static void main(String arr[])
   {
	   GraphicsEx f = new GraphicsEx();
	   f.setSize(500,400);
	   f.setVisible(true);
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

