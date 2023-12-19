package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class Deposit {
	JFrame frame;
	TextField depAccountNoTf, depAccountNameTf, depAccountBalanceTf, depAmountTf;
	Label titleLbl, depAccountNoLbl, depAccountNameLbl, depAccountBalanceLbl, depAmountLbl;

	Button saveDepositBtn, backBtn;
	JDateChooser dateChooser;

	Deposit(JFrame previousFrame) {
		frame = new JFrame("FinFlow Banking System");
		int x = previousFrame.getLocation().x;
		int y = previousFrame.getLocation().y;
		frame.setLocation(x, y);
		OuterListner o = new OuterListner(this);

		titleLbl = new Label();
		titleLbl.setText("Deposit");
		titleLbl.setBounds(330, 35, 250, 35);
		titleLbl.setFont(new Font("Arial", Font.PLAIN, 32));
		titleLbl.setBackground(new Color(136, 207, 157));

		depAccountNoLbl = new Label();
		depAccountNoLbl.setText("Account No:");
		depAccountNoLbl.setBounds(60, 100, 90, 25);
		depAccountNoLbl.setBackground(new Color(136, 207, 157));

		depAccountNoTf = new TextField();
		depAccountNoTf.setBounds(160, 100, 200, 25);
		depAccountNoTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// account balance
		depAccountBalanceLbl = new Label();
		depAccountBalanceLbl.setText("Account Balance:");
		depAccountBalanceLbl.setBounds(60, 150, 100, 25);
		depAccountBalanceLbl.setBackground(new Color(136, 207, 157));

		depAccountBalanceTf = new TextField();
		depAccountBalanceTf.setBounds(160, 150, 200, 25);
		depAccountBalanceTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// Account Name
		depAccountNameLbl = new Label();
		depAccountNameLbl.setText("Account Name:");
		depAccountNameLbl.setBounds(430, 100, 90, 25);
		depAccountNameLbl.setBackground(new Color(136, 207, 157));

		depAccountNameTf = new TextField();
		depAccountNameTf.setBounds(530, 100, 200, 25);
		depAccountNameTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// Deposit Amount
		depAmountLbl = new Label();
		depAmountLbl.setText("Deposit Amount:");
		depAmountLbl.setBounds(430, 150, 90, 25);
		depAmountLbl.setBackground(new Color(136, 207, 157));

		depAmountTf = new TextField();
		depAmountTf.setBounds(530, 150, 200, 25);
		depAmountTf.setFont(new Font("Arial", Font.PLAIN, 13));

		saveDepositBtn = new Button("Save");
		saveDepositBtn.addActionListener(o);
		saveDepositBtn.setBounds(310, 260, 150, 40);
		saveDepositBtn.setFont(new Font("Arial", Font.PLAIN, 13));
		saveDepositBtn.setBackground(new Color(12, 107, 40));
		saveDepositBtn.setForeground(Color.WHITE);


		backBtn = new Button("<");
		backBtn.addActionListener(o);
		backBtn.setBounds(10, 35, 30, 30);
		backBtn.setFont(new Font("Arial", Font.PLAIN, 30));
		backBtn.setBackground(new Color(12, 107, 40));
		backBtn.setForeground(Color.WHITE);

		frame.add(depAccountNoLbl);
		frame.add(depAccountNoTf);

		frame.add(depAccountBalanceLbl);
		frame.add(depAccountBalanceTf);

		frame.add(depAccountNameLbl);
		frame.add(depAccountNameTf);

		frame.add(depAmountLbl);
		frame.add(depAmountTf);

		frame.add(saveDepositBtn);
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
