//Q25. WAP for copy,shift and exchange.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ass25 implements ActionListener{
	JTextField t1,t2;
	JButton b1,b2,b3;

	Ass25(){
		JFrame f = new JFrame();
		t1=new JTextField();
		t2=new JTextField();
		t2.setEditable(false);
		b1= new JButton("copy");
		b2= new JButton(">>");
		b3= new JButton("exchange");
		t1.setBounds(50,100,150,30);
		t2.setBounds(50,150,150,30);
		b1.setBounds(50,200,100,30);
		b2.setBounds(50,250,100,30);
		b3.setBounds(50,300,100,30);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		f.setSize(700,700);
		f.setLayout(null);
		f.setVisible(true);
		//f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		int a=Integer.parseInt(t1.getText());
		//int a=Integer.parseInt(t1.getText());
	
		if(e.getSource()==b1){
			String s=t1.getText();
			t2.setText(s);
		}
		else if(e.getSource()==b2){
			String s=t1.getText();
			t2.setText(s);
			t1.setText("");
		}
		else if(e.getSource()==b3){
			String temp=t1.getText();
			String s=t2.getText();
			t2.setText(temp);
			t1.setText(s);
		}
	}

	public static void main(String arg[]){
		new Ass25();
	} 
}