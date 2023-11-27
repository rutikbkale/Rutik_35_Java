// Q19. WAP for card layout.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ass19 extends JFrame implements ActionListener{
	Container cd;
	CardLayout crd;

	Ass19(){
		cd=getContentPane();
		//cd = new Container();
		crd= new CardLayout(40,50);
		cd.setLayout(crd);
		//setLayout(crd);
		JButton b1 = new JButton("first");
		JButton b2 = new JButton("second");
		JButton b3 = new JButton("third");
		JButton b4 = new JButton("forth");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		cd.add("1",b1);	
		cd.add("2",b2);	
		cd.add("3",b3);	
		cd.add("4",b4);		
	}

	public void actionPerformed(ActionEvent e){
		crd.next(cd);
	}

	public static void main(String arg[]){
		Ass19 obj = new Ass19();
		obj.setSize(500,500);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
}