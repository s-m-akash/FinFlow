package main;

import java.awt.Color;

import javax.swing.JFrame;

public class Deposit {
	JFrame frame;
	Deposit(JFrame previousFrame){
		frame = new JFrame("Fin Flow");
		int x = previousFrame.getLocation().x;
		int y = previousFrame.getLocation().y;
		frame.setLocation(x, y);

		OuterListner o = new OuterListner(this);
		
		
		
		
		
		
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(136, 207, 157));
	}
}
