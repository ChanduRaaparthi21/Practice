//program to demonstrate borderlayout

import java.awt.*;

class BorderLayoutEx extends Frame
{
	public static void main(String arr[])
	{
		
		BorderLayoutEx f = new BorderLayoutEx();
	      f.setSize(300,400);
	      f.setVisible(true);
	      f.setBackground(Color.blue);
	      
	      //setting layout
	      BorderLayout f1 = new BorderLayout(10,20);
	      
	      //setting layout to the frame
	      f.setLayout(f1);
	      //create a button
	      Button b1 = new Button("red");
	      //add this button to frame
	      f.add(b1,BorderLayout.CENTER);
	      
	      //create a button
	      Button b2 = new Button("green");
	      //add this button to frame
	      f.add(b2,BorderLayout.EAST);
	      
	      
	      //create a button
	      Button b3 = new Button("blue");
	      //add this button to frame
	      f.add(b3,BorderLayout.NORTH);
	      
	      //create a button
	      Button b4 = new Button("yellow");
	      //add this button to frame
	      f.add(b4,BorderLayout.WEST);
	      
	      //create a button
	      Button b5 = new Button("white");
	      //add this button to frame
	      f.add(b5,BorderLayout.SOUTH);
	      
	      
	      
	}
}