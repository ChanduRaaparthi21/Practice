//program to demonstrate JComponents in swing in java : 1.JLabel and 2.JButton and 3.JComboBox 4.JList
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class JComponentsEx extends JFrame implements ActionListener
{
	
	JLabel j1;
	
	JComponentsEx()
	{
		//idhi jframe close avvadaniki
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		//idhi layouts kosam
		FlowLayout fl = new FlowLayout();
        this.setLayout(fl);		
        
        Container c =this.getContentPane();
        
        //creating image icon object
        ImageIcon img = new ImageIcon("icons8-bbb-100.png");
        
        
        
        
         //1.JButton
         JButton b1 = new JButton("click me",img);
            b1.addActionListener(this);
              c.add(b1);
         

         //2.JLabel
          j1 = new JLabel();
          c.add(j1);
          
          //3.JComboBox
          String countries [] = {"india","aus","uk"};
          
          JComboBox jc = new JComboBox(countries);
          
          jc.addActionListener(this);
          c.add(jc);
          
          //4.JList
          JList list = new JList();
          String interets [] = {"tv wacting","playing","chilling"};
          list.setListData(interets);
          c.add(list);
          
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		j1.setText("Button clicked at : "+new Date());
		
	}
	
	public static void main(String arr[])
	{
		
		//creating the JFrame
		JComponentsEx f = new JComponentsEx();
		f.setSize(400, 500);
		f.setVisible(true);
		
		
	}
	
	
}