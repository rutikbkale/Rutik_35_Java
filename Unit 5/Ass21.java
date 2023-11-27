//Q21. WAP for border layout.

import java.awt.*;
import javax.swing.*;

public class Ass21{
	JButton b1,b2,b3,b4,b5;
	
	Ass21(){
		JFrame f = new JFrame();
		b1= new JButton("TOP");
		b2= new JButton("BOTTOM");
		b3= new JButton("RIGHT");
		b4= new JButton("LEFT");
		b5= new JButton("CENTER");
		
		f.add(b1, BorderLayout.NORTH);   
    		f.add(b2, BorderLayout.SOUTH);    
    		f.add(b3, BorderLayout.EAST);   
    		f.add(b4, BorderLayout.WEST);   
    		f.add(b5, BorderLayout.CENTER); 

		f.setSize(700,700);
		f.setVisible(true); 

	}

	public static void main(String arg[]){
		new Ass21();
	}
}