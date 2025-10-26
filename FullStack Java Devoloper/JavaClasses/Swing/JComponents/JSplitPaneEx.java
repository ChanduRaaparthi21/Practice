//program to demonstrate JSplitPane in java

import javax.swing.*;
import java.awt.*;

class JSplitPaneEx extends JFrame
{

    JSplitPaneEx()
    {
        Container c = this.getContentPane();
    
        JButton l = new JButton("click here");
         JCheckBox r = new JCheckBox("clicked");
           JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,l,r);
            c.add(jsp);
    }
 



public static void main(String arr[])
{

    JSplitPaneEx js = new JSplitPaneEx();
    js.setSize(400, 500);
    js.setVisible(true);
    js.setDefaultCloseOperation(EXIT_ON_CLOSE);
    

}

}