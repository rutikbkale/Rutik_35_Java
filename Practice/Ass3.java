// WAP for canvas to create 10 circle within one another.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Ass3 extends Canvas{
	public void paint(Graphics g){
		int x= getWidth()/2;
		int y= getHeight()/2;
		int radius =300;

		for(int i=10; i>0; i--){
			g.drawOval(x-(15*i),y-(15*i),radius,radius);
			if(i%2==0){
				g.setColor(Color.RED);
			}
			else
				g.setColor(Color.BLUE);
			g.fillOval(x-(15*i),y-(15*i),radius,radius);
			radius -=30;
			
		}
	}

	public static void main(String arg[]){
		JFrame f = new JFrame();
		Ass3 dg = new Ass3();
		f.add(dg);
		f.setSize(500, 500);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
