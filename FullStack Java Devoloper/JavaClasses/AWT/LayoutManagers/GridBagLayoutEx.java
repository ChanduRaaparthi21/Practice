//program to demonstrate GridBagLayoutEx

import java.awt.*;

class GridBagLayoutEx extends Frame
{
	public static void main(String arr[])
	{
		GridBagLayoutEx f = new GridBagLayoutEx();

		f.setSize(400, 300);
		f.setVisible(true);
		
		GridBagLayout gl = new GridBagLayout();
		GridBagConstraints cons = new GridBagConstraints();
		
		f.setLayout(gl);
		cons.gridx=0;
		cons.gridy=0;
		
		cons.weightx=0.50;
		cons.weighty=0.30;
		
		Button b1 = new Button("red");
		gl.setConstraints(b1, cons);
		f.add(b1);
		cons.gridx=1;
		cons.gridy=0;
		
		Button b2 = new Button("blue");
		gl.setConstraints(b2, cons);
		f.add(b2);
		
		cons.gridx=0;
		cons.gridy=1;
		
		Button b3 = new Button("gree");
		gl.setConstraints(b3, cons);
		f.add(b3);
		
		cons.gridx=1;
		cons.gridy=1;

		Button b4 = new Button("violet");
		gl.setConstraints(b4, cons);
		f.add(b4);
		
		
	}
	    
}