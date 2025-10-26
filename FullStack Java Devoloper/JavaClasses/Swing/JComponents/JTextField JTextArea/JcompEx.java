//program to demonstrate jtextfield jtextarea jradiobutton 

import javax.swing.*;
import java.awt.*;

class JcompEx extends JFrame
{

    JcompEx()
    {
        Container c = this.getContentPane();
        c.setLayout(null);

        JLabel jl = new JLabel("Name");
        jl.setBounds(100, 100, 130, 25);
        c.add(jl);

        JTextField jt = new JTextField();
        jt.setBounds(250, 100, 130, 25);
        c.add(jt);

        JLabel a = new JLabel("Address");
        a.setBounds(100, 170, 130, 25);
        c.add(a);

        JTextArea addr = new JTextArea("");
        addr.setBounds(250, 170, 135, 100);
        c.add(addr);


        JLabel g = new JLabel("Gender");
        g.setBounds(100, 300, 130, 25);
        c.add(g);

                //this is for m button
        JRadioButton m = new JRadioButton("M");
        m.setBounds(250, 300, 75, 25);
        c.add(m);

        //this is for f button
        JRadioButton f = new JRadioButton("F");
        f.setBounds(335, 300, 75, 25);
        c.add(f);


        //this is for selceting only one option m or f
        ButtonGroup bg = new ButtonGroup();
          bg.add(m);
          bg.add(f);


          JLabel ln = new JLabel("Languages");
          ln.setBounds(100, 350, 130, 25);
          c.add(ln);

          JCheckBox tl = new JCheckBox("TEL");
          tl.setBounds(250, 350, 75, 25);
          c.add(tl);

          JCheckBox en = new JCheckBox("ENG");
          en.setBounds(335, 350, 75, 25);
          c.add(en);

          JButton jb = new JButton("Submit");
          jb.setBounds(165, 400, 150, 35);
          c.add(jb);
    }

          public static void main(String arr[])
         {

                JcompEx jc = new JcompEx();
                jc.setSize(500, 400);
                jc.setVisible(true);
                jc.setDefaultCloseOperation(EXIT_ON_CLOSE);

}

}