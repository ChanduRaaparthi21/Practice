//program to demonstrate flowlayout

import java.awt.*;

class FlowLayoutEx extends Frame
{
	public static void main(String arr[])
	{
		
		FlowLayoutEx f = new FlowLayoutEx();
	      f.setSize(300,400);
	      f.setVisible(true);
	      f.setBackground(Color.blue);
	      
	      //setting layout
	      FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT,10,20);
	      
	      //setting layout to the frame
	      f.setLayout(f1);
	      //create a button
	      Button b1 = new Button("red");
	      //add this button to frame
	      f.add(b1);
	      
	      //create a button
	      Button b2 = new Button("green");
	      //add this button to frame
	      f.add(b2);
	      
	      
	      //create a button
	      Button b3 = new Button("blue");
	      //add this button to frame
	      f.add(b3);
	      
	      //create a button
	      Button b4 = new Button("yellow");
	      //add this button to frame
	      f.add(b4);
	      
	      //create a button
	      Button b5 = new Button("white");
	      //add this button to frame
	      f.add(b5);
	      
	      
	      
	}
}