package main;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;

public class Withdraw {
	JFrame frame;
	TextField withAccountNoTf, withAccountNameTf, withAccountBalanceTf, withAmountTf;
	Label titleLbl, withAccountNoLbl, withAccountNameLbl, withAccountBalanceLbl, withAmountLbl;

	Button saveWithdrawBtn, backBtn;
	JDateChooser dateChooser;

	Withdraw(JFrame previousFrame) {
		frame = new JFrame("FinFlow Banking System");
		int x = previousFrame.getLocation().x;
		int y = previousFrame.getLocation().y;
		frame.setLocation(x, y);
		OuterListner o = new OuterListner(this);

		titleLbl = new Label();
		titleLbl.setText("Withdraw");
		titleLbl.setBounds(330, 35, 250, 35);
		titleLbl.setFont(new Font("Arial", Font.PLAIN, 32));
		titleLbl.setBackground(new Color(136, 207, 157));

		withAccountNoLbl = new Label();
		withAccountNoLbl.setText("Account No:");
		withAccountNoLbl.setBounds(60, 100, 90, 25);
		withAccountNoLbl.setBackground(new Color(136, 207, 157));

		withAccountNoTf = new TextField();
		withAccountNoTf.setBounds(160, 100, 200, 25);
		withAccountNoTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// account balance
		withAccountBalanceLbl = new Label();
		withAccountBalanceLbl.setText("Account Balance:");
		withAccountBalanceLbl.setBounds(60, 150, 100, 25);
		withAccountBalanceLbl.setBackground(new Color(136, 207, 157));

		withAccountBalanceTf = new TextField();
		withAccountBalanceTf.setBounds(160, 150, 200, 25);
		withAccountBalanceTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// Account Name
		withAccountNameLbl = new Label();
		withAccountNameLbl.setText("Account Name:");
		withAccountNameLbl.setBounds(430, 100, 90, 25);
		withAccountNameLbl.setBackground(new Color(136, 207, 157));

		withAccountNameTf = new TextField();
		withAccountNameTf.setBounds(530, 100, 200, 25);
		withAccountNameTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// Deposit Amount
		withAmountLbl = new Label();
		withAmountLbl.setText("Withdraw Amount:");
		withAmountLbl.setBounds(430, 150, 100, 25);
		withAmountLbl.setBackground(new Color(136, 207, 157));

		withAmountTf = new TextField();
		withAmountTf.setBounds(530, 150, 200, 25);
		withAmountTf.setFont(new Font("Arial", Font.PLAIN, 13));

		saveWithdrawBtn = new Button("Save");
		saveWithdrawBtn.addActionListener(o);
		saveWithdrawBtn.setBounds(310, 260, 150, 40);
		saveWithdrawBtn.setFont(new Font("Arial", Font.PLAIN, 13));
		saveWithdrawBtn.setBackground(new Color(12, 107, 40));
		saveWithdrawBtn.setForeground(Color.WHITE);


		backBtn = new Button("<");
		backBtn.addActionListener(o);
		backBtn.setBounds(10, 35, 30, 30);
		backBtn.setFont(new Font("Arial", Font.PLAIN, 30));
		backBtn.setBackground(new Color(12, 107, 40));
		backBtn.setForeground(Color.WHITE);

		frame.add(withAccountNoLbl);
		frame.add(withAccountNoTf);

		frame.add(withAccountBalanceLbl);
		frame.add(withAccountBalanceTf);

		frame.add(withAccountNameLbl);
		frame.add(withAccountNameTf);

		frame.add(withAmountLbl);
		frame.add(withAmountTf);

		frame.add(saveWithdrawBtn);
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
