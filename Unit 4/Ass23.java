//Q23. WAP for swing button class has a caption red after clicking is turn to be blue. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ass23 implements ActionListener{
	JButton b;
	
	Ass23(){
		JFrame f = new JFrame();
		b= new JButton("RED");
		b.setForeground(Color.WHITE);
		b.setBackground(Color.RED);
		b.setBounds(100,100,150,50);
		f.add(b);
		b.addActionListener(this);   

		f.setSize(700,700);
		f.setLayout(null);
		f.setVisible(true); 

	}

	public void actionPerformed(ActionEvent e){
		b.setText("BLUE");
		b.setBackground(Color.BLUE);
		b.setForeground(Color.WHITE);
	}

	public static void main(String arg[]){
		new Ass23();
	}
}