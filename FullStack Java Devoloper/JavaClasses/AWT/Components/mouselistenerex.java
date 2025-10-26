//program to demonstrate mouse events with adapter and anonymmous inner class in java

import java.awt.*;
import java.awt.event.*;


class mouselistenerex extends Frame
{
	Button b1;
	
	mouselistenerex()
	{
		
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		
		
		b1 = new Button("click me");
         this.add(b1);	
         
         //adapter and anonymous inner class
         
                             //this is adapter class
         b1.addMouseListener(new MouseAdapter() {   
        	
        	 //this is anonymos inner class
        	 
        	 public void mouseClicked(MouseEvent e)
        	 
        	 {
        		 
        		 System.out.println("mouse clicked");
        	 }
        	 
        	 
         });
	}
	public static void main(String arr[]) {
		
		mouselistenerex f = new mouselistenerex();

		f.setSize(350, 450);
		f.setVisible(true);
		
	}
}