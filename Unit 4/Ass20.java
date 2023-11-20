//Q20. WAP for flow layout.

import javax.swing.*;
import java.awt.*;

class Ass20 {
	public static void main(String arg[]){
		JFrame f = new JFrame("Example for Flow Layout");

		JButton b1 = new JButton("B1");
		JButton b2 = new JButton("B2");
		JButton b3 = new JButton("B3");
		JButton b4 = new JButton("B4");
		JButton b5 = new JButton("B5");

		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);

		f.setSize(500,500);
		f.setVisible(true);
		//f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}