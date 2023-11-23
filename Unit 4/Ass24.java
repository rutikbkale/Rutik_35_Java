//Q24.WAP for selected text.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ass24 implements ActionListener{
	JTextField t1,t2;
	JButton b;

	Ass24(){
		JFrame f = new JFrame();
		t1=new JTextField("Welcome to MCA.");
		t2=new JTextField();
		t2.setEditable(false);
		b= new JButton("SHOW TEXT");
		t1.setBounds(50,100,150,30);
		t2.setBounds(50,150,150,30);
		b.setBounds(50,200,100,30);

		b.addActionListener(this);
		f.add(t1);
		f.add(t2);
		f.add(b);
		f.setSize(700,700);
		f.setLayout(null);
		f.setVisible(true);
		//f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		String s = t1.getSelectedText();
		t2.setText(s);
	}

	public static void main(String arg[]){
		new Ass24();
	} 
}