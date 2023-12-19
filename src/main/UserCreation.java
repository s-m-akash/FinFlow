package main;

import javax.swing.*;
import java.awt.*;

public class UserCreation {
	JFrame frame;
	TextField createUserIdTf, createFullNameTf, createNewPwTf, createRemarksTf;
	Label titleLbl, createUserIdLbl, createFullNameLbl, createNewPwLbl, createRemarksLbl;

	Button createUserBtn, backBtn;

	UserCreation(JFrame previousFrame) {
		frame = new JFrame("FinFlow Banking System");
		int x = previousFrame.getLocation().x;
		int y = previousFrame.getLocation().y;
		frame.setLocation(x, y);
		OuterListner o = new OuterListner(this);

		titleLbl = new Label();
		titleLbl.setText("User Creation");
		titleLbl.setBounds(300, 35, 250, 35);
		titleLbl.setFont(new Font("Arial", Font.PLAIN, 32));
		titleLbl.setBackground(new Color(136, 207, 157));

		createUserIdLbl = new Label();
		createUserIdLbl.setText("User Id:");
		createUserIdLbl.setBounds(60, 100, 100, 25);
		createUserIdLbl.setBackground(new Color(136, 207, 157));

		createUserIdTf = new TextField();
		createUserIdTf.setBounds(160, 100, 200, 25);
		createUserIdTf.setFont(new Font("Arial", Font.PLAIN, 13));


		createNewPwLbl = new Label();
		createNewPwLbl.setText("New Password:");
		createNewPwLbl.setBounds(60, 150, 100, 25);
		createNewPwLbl.setBackground(new Color(136, 207, 157));

		createNewPwTf = new TextField();
		createNewPwTf.setBounds(160, 150, 200, 25);
		createNewPwTf.setFont(new Font("Arial", Font.PLAIN, 13));


		createFullNameLbl = new Label();
		createFullNameLbl.setText("Full Name:");
		createFullNameLbl.setBounds(430, 100, 100, 25);
		createFullNameLbl.setBackground(new Color(136, 207, 157));

		createFullNameTf = new TextField();
		createFullNameTf.setBounds(530, 100, 200, 25);
		createFullNameTf.setFont(new Font("Arial", Font.PLAIN, 13));


		createRemarksLbl = new Label();
		createRemarksLbl.setText("Remarks:");
		createRemarksLbl.setBounds(430, 150, 100, 25);
		createRemarksLbl.setBackground(new Color(136, 207, 157));

		createRemarksTf = new TextField();
		createRemarksTf.setBounds(530, 150, 200, 25);
		createRemarksTf.setFont(new Font("Arial", Font.PLAIN, 13));

		createUserBtn = new Button("Create");
		createUserBtn.addActionListener(o);
		createUserBtn.setBounds(310, 260, 150, 40);
		createUserBtn.setFont(new Font("Arial", Font.PLAIN, 13));
		createUserBtn.setBackground(new Color(12, 107, 40));
		createUserBtn.setForeground(Color.WHITE);


		backBtn = new Button("<");
		backBtn.addActionListener(o);
		backBtn.setBounds(10, 35, 30, 30);
		backBtn.setFont(new Font("Arial", Font.PLAIN, 30));
		backBtn.setBackground(new Color(12, 107, 40));
		backBtn.setForeground(Color.WHITE);

		frame.add(createUserIdLbl);
		frame.add(createUserIdTf);

		frame.add(createNewPwLbl);
		frame.add(createNewPwTf);

		frame.add(createFullNameLbl);
		frame.add(createFullNameTf);

		frame.add(createRemarksLbl);
		frame.add(createRemarksTf);

		frame.add(createUserBtn);
		frame.add(backBtn);
		frame.add(titleLbl);
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(136, 207, 157));
	}
}
