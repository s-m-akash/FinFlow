package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JFrame;

public class Modules {
	JFrame frame;
	Label moduleTitle;
	Button accountOpeningMdlBtn, depositMdlbtn, withdrawMdlBtn, fundTransferMdlBtn, statementMdlBtn, userCreationMdlBtn,
			logoutMdlBtn;

	Modules(JFrame previousFrame) {
		frame = new JFrame("FinFlow Banking System");
		int x = previousFrame.getLocation().x;
		int y = previousFrame.getLocation().y;
		frame.setLocation(x, y);

		OuterListner o = new OuterListner(this);

		moduleTitle = new Label();
		moduleTitle.setText("FinFlow Banking System");
		moduleTitle.setBounds(220, 30, 400, 40);
		moduleTitle.setFont(new Font("Arial", Font.PLAIN, 32));
		moduleTitle.setBackground(new Color(136, 207, 157));

		logoutMdlBtn = new Button("Logout");
		logoutMdlBtn.addActionListener(o);
		logoutMdlBtn.setBounds(675, 35, 70, 25);
		logoutMdlBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		logoutMdlBtn.setBackground(new Color(12, 107, 20));
		logoutMdlBtn.setForeground(Color.WHITE);

		accountOpeningMdlBtn = new Button("Account Open");
		accountOpeningMdlBtn.addActionListener(o);
		accountOpeningMdlBtn.setBounds(30, 100, 200, 125);
		accountOpeningMdlBtn.setFont(new Font("Arial", Font.PLAIN, 20));
		accountOpeningMdlBtn.setBackground(new Color(12, 107, 40));
		accountOpeningMdlBtn.setForeground(Color.WHITE);

		depositMdlbtn = new Button("Deposit");
		depositMdlbtn.addActionListener(o);
		depositMdlbtn.setBounds(290, 100, 200, 125);
		depositMdlbtn.setFont(new Font("Arial", Font.PLAIN, 20));
		depositMdlbtn.setBackground(new Color(12, 107, 40));
		depositMdlbtn.setForeground(Color.WHITE);

		withdrawMdlBtn = new Button("Withdraw");
		withdrawMdlBtn.addActionListener(o);
		withdrawMdlBtn.setBounds(550, 100, 200, 125);
		withdrawMdlBtn.setFont(new Font("Arial", Font.PLAIN, 20));
		withdrawMdlBtn.setBackground(new Color(12, 107, 40));
		withdrawMdlBtn.setForeground(Color.WHITE);

		fundTransferMdlBtn = new Button("Fund Transfer");
		fundTransferMdlBtn.addActionListener(o);
		fundTransferMdlBtn.setBounds(30, 280, 200, 125);
		fundTransferMdlBtn.setFont(new Font("Arial", Font.PLAIN, 20));
		fundTransferMdlBtn.setBackground(new Color(12, 107, 40));
		fundTransferMdlBtn.setForeground(Color.WHITE);

		statementMdlBtn = new Button("Statement");
		statementMdlBtn.addActionListener(o);
		statementMdlBtn.setBounds(290, 280, 200, 125);
		statementMdlBtn.setFont(new Font("Arial", Font.PLAIN, 20));
		statementMdlBtn.setBackground(new Color(12, 107, 40));
		statementMdlBtn.setForeground(Color.WHITE);

		userCreationMdlBtn = new Button("User Creation");
		userCreationMdlBtn.addActionListener(o);
		userCreationMdlBtn.setBounds(550, 280, 200, 125);
		userCreationMdlBtn.setFont(new Font("Arial", Font.PLAIN, 20));
		userCreationMdlBtn.setBackground(new Color(12, 107, 40));
		userCreationMdlBtn.setForeground(Color.WHITE);

		frame.add(moduleTitle);
		frame.add(logoutMdlBtn);
		frame.add(accountOpeningMdlBtn);
		frame.add(depositMdlbtn);
		frame.add(withdrawMdlBtn);
		frame.add(fundTransferMdlBtn);
		frame.add(statementMdlBtn);
		frame.add(userCreationMdlBtn);

		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(136, 207, 157));

	}

}
