//program to demonstrate checkbox in awt in java

import java.awt.*;
import java.awt.event.*;

class checkbox extends Frame implements ItemListener
{
	Checkbox c1,c2,c3;
	
	
	checkbox()
	{
		/*THIS IS FOR MULTIPLE SECTIONS( ANNITINI SELECT CHEYYADANIKI EE CODE
		
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		
		c1 =new Checkbox("Telugu");
		this.add(c1);
		c1.addItemListener(this);
		
		c2 =new Checkbox("English");
		this.add(c2);
		c2.addItemListener(this);

		c3 =new Checkbox("Hindi");
		this.add(c3);
		c3.addItemListener(this); */

		
//THIS IS FOR ONLY ONE SELECTED(EADHAINA OKA DHANINI mathrame SELECT CHEYYADANIKI)
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		    
		CheckboxGroup cbg = new CheckboxGroup();
		
		
		
		c1 =new Checkbox("Telugu",false,cbg);
		this.add(c1);
		c1.addItemListener(this);
		
		c2 =new Checkbox("English",false,cbg);
		this.add(c2);
		c2.addItemListener(this);

		c3 =new Checkbox("Hindi",false,cbg);
		this.add(c3);
		c3.addItemListener(this);
		
	}
	public void paint(Graphics g)
	{
		g.drawString("You have selected c1 :"+c1.getState(),10,100);
		g.drawString("You have selected c2 :"+c2.getState(),10,150);
		g.drawString("You have selected c3 :"+c3.getState(),10,200);

	}
	
	
	public void itemStateChanged(ItemEvent e)
	{
		
		repaint();
	}
	
	
	
	
	public static void main(String arr[])
	{
		checkbox cb = new checkbox();
		cb.setSize(400,300);
		cb.setVisible(true);
		
		
	}
}