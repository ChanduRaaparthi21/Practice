//program to demonstrate Cardlayout

import java.awt.*;

class CardLayoutEx extends Frame
{
	public static void main(String arr[])
	{
		
		CardLayoutEx f = new CardLayoutEx();
	      f.setSize(300,400);
	      f.setVisible(true);
	      f.setBackground(Color.blue);
	      
	      //setting layout
	      CardLayout cl = new CardLayout();
	      
	      //setting layout to the frame
	      f.setLayout(cl);
	      //create a button
	      Button b1 = new Button("red");
	      //add this button to frame
	      f.add("red",b1);
	      
	      //create a button
	      Button b2 = new Button("green");
	      //add this button to frame
	      f.add("green",b2);
	      
	      
	      //create a button
	      Button b3 = new Button("blue");
	      //add this button to frame
	      f.add("blue",b3);
	      
	      //create a button
	      Button b4 = new Button("yellow");
	      //add this button to frame
	      f.add("yellow",b4);
	      
	      //create a button
	      Button b5 = new Button("white");
	      //add this button to frame
	      f.add("white",b5);
	      
	      cl.show(f, "white");
	      
	      
	      
	}
}