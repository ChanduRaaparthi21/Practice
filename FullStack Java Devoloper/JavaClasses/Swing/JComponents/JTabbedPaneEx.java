//program to demonstrate JTabbedpane in java

import javax.swing.*;
import java.awt.*;

class JTabbedPaneEx extends JFrame
{
	JTabbedPaneEx()
	{
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		JTabbedPane p = new JTabbedPane(JTabbedPane.TOP);
		p.add("one", new Home());
		p.add("second", new View());
		p.insertTab("three", null, new View(), "this is view tab", 1);
		
		this.add(p);
		
	}
	
	
	public static void main(String arr[])
	{
		JTabbedPaneEx f = new JTabbedPaneEx();
		f.setSize(400,350);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
}

class Home extends JPanel //this is for tab
{
   Home()
   {
	   //tab lo subparts like subtabs
	   JButton b1 = new JButton("File");
	   JButton b2 = new JButton("Edit");
	   JButton b3 = new JButton("Refactor");
	   JButton b4 = new JButton("Navigate");
	   JButton b5 = new JButton("Search");

	   this.add(b1);
	   this.add(b2);
	   this.add(b3);
	   this.add(b4);
	   this.add(b5);
	   
   }
	
}

class View extends JPanel //its also a tab
{
	
	View()
	{
		   //tab lo subparts like subtabs

		   JButton b1 = new JButton("Zoom");
		   JButton b2 = new JButton("Show or Hide");
		   JButton b3 = new JButton("Display");
		   
		   this.add(b1);
		   this.add(b2);
		   this.add(b3);

		
	}
	
}