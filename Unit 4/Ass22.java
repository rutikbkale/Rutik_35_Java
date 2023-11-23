//Q22. WAP for swing button class which shows the "Welcome to Swing" after clicking the button. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ass22 implements ActionListener{
	JButton b;
	
	Ass22(){
		JFrame f = new JFrame();
		b= new JButton("Click here");
		b.setBounds(100,100,150,50);
		f.add(b);
		b.addActionListener(this);   

		f.setSize(700,700);
		f.setLayout(null);
		f.setVisible(true); 

	}

	public void actionPerformed(ActionEvent e){
		b.setText("Welcome to Swing");
	}

	public static void main(String arg[]){
		new Ass22();
	}
}