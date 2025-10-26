//program to demonstrate JMenu JCheckBox JRadioButton 

import javax.swing.*;
import java.awt.*;

class jcompEx extends JFrame
{

    jcompEx()
    {
       Container c = this.getContentPane();
       BorderLayout b1 = new BorderLayout();

       //creating menubar
          JMenuBar mb = new JMenuBar();


          //creating menu in menu bar
          JMenu fil = new JMenu("File");
          mb.add(fil);

          JMenu edt = new JMenu("Edit");
          mb.add(edt);

          c.add("North",mb);

          //creating jmenu item in menu in file
          JMenuItem s = new JMenuItem("Save");
          JMenuItem n = new JMenuItem("new");

          //creating jcheckbox menu item in file
          JCheckBoxMenuItem o = new JCheckBoxMenuItem("open");

          fil.add(s);
          fil.add(n);
          fil.add(o);

          //creating jmenu item in menu in edit
          JMenuItem u = new JMenuItem("undo");
          JMenuItem r = new JMenuItem("redo");
          JMenuItem cu = new JMenuItem("cut");
          JMenuItem co = new JMenuItem("copy");

          //JRadioButtonMenuItem in edit 
          JRadioButtonMenuItem p = new JRadioButtonMenuItem("paste");

          edt.add(u);
          edt.add(r);
          edt.add(cu);
          edt.add(co);
          edt.add(p);

          




    }




public static void main(String arr[])

{
    
     jcompEx jc = new jcompEx();
      jc.setSize(400, 500);
      jc.setVisible(true);
      jc.setDefaultCloseOperation(EXIT_ON_CLOSE);


}


}