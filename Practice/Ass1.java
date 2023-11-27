package Sample2;

import java.awt.Font;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Ass1 implements ActionListener{

    JButton btn;
    Random rand = new Random();
    JTextField t1,t2;
    JLabel l1,l2;

    public Ass1(){
        JFrame f = new JFrame("Guess the Number");
        btn= new JButton("SUBMIT");
        l1= new JLabel("Enter your guess :");
        t1= new JTextField();
        t2=new JTextField();
        t2.setEditable(false);
        l2= new JLabel();

        l1.setBounds(500, 100, 200, 50);
        t1.setBounds(750, 100, 200, 50);
        btn.setBounds(625, 200, 200, 50);
        l2.setBounds(600, 400, 300, 70);
        l1.setFont(new Font("Times new Roman", Font.PLAIN, 27));
        l2.setFont(new Font("Times new Roman", Font.PLAIN, 27));
        t1.setFont(new Font("Times new Roman", Font.PLAIN, 27));
        btn.setFont(new Font("Times new Roman", Font.PLAIN, 18));

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(btn);
        btn.addActionListener(this);
        f.setLayout(null);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    int systemNum=rand.nextInt(100);
    public void actionPerformed(ActionEvent e){

        int userNum=Integer.parseInt(t1.getText());

        if(systemNum>userNum){
            l2.setText("Your Guess is Small.");
        }
        else if(systemNum<userNum){
            l2.setText("Your Guess is Big.");
        }
        else{
            l2.setText("You won the Game...");
        }

    }

    public static void main(String[] args) {
        new Ass1();
    }
}
