//program to demonstate button in awt in java

import java.awt.*;
import java.awt.event.*;

class ButtonEx extends Frame implements ActionListener
{
	ButtonEx()
	{
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		//step1 create a component
		Button b1 = new Button("red");
		//add component to the container(Frame)
		this.add(b1);
		//add listener to the component
		b1.addActionListener(this);
		
		
         Button b2 = new Button("blue");
		 this.add(b2);
		 b2.addActionListener(this);
		 
		
         Button b3 = new Button("green");
         this.add(b3);
		b3.addActionListener(this);
	
	}
	
	   public void actionPerformed(ActionEvent e)
	   {
		String bname = e.getActionCommand();
		
		if(bname.equals("red"))
             //set to bgcolor red
			this.setBackground(Color.red);
			
			if(bname.equals("blue"))
	             //set to bgcolor blue 
				this.setBackground(Color.blue);
				
				
				if(bname.equals("green"))
				//set to bgcolor green
					this.setBackground(Color.green);
			
			
	   }
	
	
	
	public static void main(String arr[])
	
	{
		ButtonEx f = new ButtonEx();
		f.setSize(400, 300);
		f.setVisible(true);
	}
}