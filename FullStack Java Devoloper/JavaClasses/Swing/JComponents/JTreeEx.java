//program to demostrate JTree in java

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

class JTreeEx extends JFrame
{
	
	JTreeEx()
	{
		
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		Container c = this.getContentPane();
				
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Object");
		
		DefaultMutableTreeNode comp = new DefaultMutableTreeNode("component");
         root.add(comp);
         
     	DefaultMutableTreeNode cont = new DefaultMutableTreeNode("container");
        comp.add(cont);
        
    	DefaultMutableTreeNode Jcomp = new DefaultMutableTreeNode("Jcomponent");
        cont.add(Jcomp);
        
    	DefaultMutableTreeNode Jcomb = new DefaultMutableTreeNode("jcombo");
        Jcomp.add(Jcomb);
        
        DefaultMutableTreeNode jtr = new DefaultMutableTreeNode("jtree");
        Jcomp.add(jtr);
        
        DefaultMutableTreeNode jsr = new DefaultMutableTreeNode("jscrollbar");
        Jcomp.add(jsr);
        
        JTree t = new JTree(root);
        c.add(t);
        
		
		
		
	}
	

public static void main(String arr[])

{

          JTreeEx f = new JTreeEx();
          f.setSize(400, 500);
          f.setVisible(true);
          f.setDefaultCloseOperation(EXIT_ON_CLOSE);

}

}