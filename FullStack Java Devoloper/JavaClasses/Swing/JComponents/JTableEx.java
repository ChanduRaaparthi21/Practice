//program to demonstrate JTable in java

import javax.swing.*;
import java.awt.*;

class JTableEx extends JFrame
{
	
	JTableEx()
	{
		
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		Container c = this.getContentPane();
		
		//creating a table
		String row [][]= {{"1","chandu","97"},{"2","sai","99"}};
		String clms[]= {"R,no","Name","Marks"};
		
		JTable t = new JTable(row,clms);
		
		JScrollPane jsp = new JScrollPane(t);
		c.add(jsp);
		
		
		
	}
	
	public static void main(String arr[])
	{
		
		JTableEx f = new JTableEx();
		f.setSize(500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
}