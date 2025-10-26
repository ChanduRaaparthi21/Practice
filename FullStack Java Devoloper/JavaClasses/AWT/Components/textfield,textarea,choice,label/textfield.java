//program to demonstrate textfield , textarea , lable ,Choice,list in java 

import java.awt.*;
import java.awt.event.*;

class textfield extends Frame
{
	Label l1,l2,l3,l4,l5;
	TextField tf1,tf2;
	TextArea ta1;
	Choice ch1;
	List li1;
	
	
	
	textfield()
	{
		/*FlowLayout fl = new FlowLayout();
		this.setLayout(fl);*/
		
		this.setLayout(null);
		
		l1=new Label("Name");
		l1.setBounds(30, 30, 80, 20);
		this.add(l1);
		
		tf1 =new TextField("type name  here",20);
		tf1.setBounds(150, 30, 80, 20);
		this.add(tf1);
				
	
		l2 = new Label("Password");
		l2.setBounds(30, 80, 80, 20);
		this.add(l2);
		
		tf2 = new TextField("type paswd here ",20);
		tf2.setBounds(150, 80, 80, 20);
		this.add(tf2);
		
		l3 = new Label("address");
		l3.setBounds(30, 120, 80, 20);
		this.add(l3);
		
		ta1 = new TextArea("",50,50,TextArea.SCROLLBARS_BOTH);
		ta1.setBounds(150, 120, 80, 80);
		this.add(ta1);
		
		l4 = new Label("country");
		l4.setBounds(30, 240, 80, 20);
		this.add(l4);
		
		ch1 = new Choice();
		ch1.add("india");
		ch1.add("ud");
		ch1.add("us");
		ch1.add("aus");
		ch1.add("pak");
        ch1.setBounds(150,240,80,80);
		this.add(ch1);
		
		l5 = new Label("interests");
		l5.setBounds(30, 290, 80, 20);
		this.add(l5);
		
		 // true ante multiple select chesukovachu,3 ante manaki eanni rows kanabadali ani
		li1 = new List(3,true);
		li1.add("Reading Books");
		li1.add("games ");
		li1.add("tv ");
		li1.add("sports ");
		li1.add("in ");
		li1.add("dd ");
		li1.add("dds ");
		li1.setBounds(150, 290, 80, 100);
		this.add(li1);
		
		
	}
	
	public static void main(String arr[])
	{
		
		textfield f = new textfield();
		f.setSize(500, 400);
		f.setVisible(true);
		
	}
	
}