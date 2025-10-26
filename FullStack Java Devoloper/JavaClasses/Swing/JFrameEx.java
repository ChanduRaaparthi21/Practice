//program to demonstrate Jframe in java

import javax.swing.*;
import java.awt.*;

class JFrameEx
{

public static void main (String arr[])
{

JFrame f = new JFrame("my swing");
f.setSize(450, 350);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //program ni close cheyyadaniki
f.setVisible(true);

FlowLayout fl = new FlowLayout();
f.setLayout(fl);

Container c = f.getContentPane(); //manam eadhaina jframe add cheyyali ante container ki add chesthamu

 JButton b1 = new JButton("click me");
 c.add(b1);

}

}