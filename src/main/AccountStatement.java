package main;

import javax.swing.*;
import java.awt.*;

public class AccountStatement {
	JFrame frame;
	TextField statementFromAccountNoTf, statementFromAccountNameTf, statementFromAccountBalanceTf;
	Label titleLbl, transferFromAccountNoLbl, transferFromAccountNameLbl, statementFromAccountBalanceLbl;

	Button statementSearchBtn, backBtn;

	AccountStatement(JFrame previousFrame) {
		frame = new JFrame("FinFlow Banking System");
		int x = previousFrame.getLocation().x;
		int y = previousFrame.getLocation().y;
		frame.setLocation(x, y);
		OuterListner o = new OuterListner(this);

		titleLbl = new Label();
		titleLbl.setText("Account Statement");
		titleLbl.setBounds(280, 35, 300, 35);
		titleLbl.setFont(new Font("Arial", Font.PLAIN, 32));
		titleLbl.setBackground(new Color(136, 207, 157));

		transferFromAccountNoLbl = new Label();
		transferFromAccountNoLbl.setText("Account No:");
		transferFromAccountNoLbl.setBounds(60, 100, 110, 25);
		transferFromAccountNoLbl.setBackground(new Color(136, 207, 157));

		statementFromAccountNoTf = new TextField();
		statementFromAccountNoTf.setBounds(160, 100, 200, 25);
		statementFromAccountNoTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// account balance
		statementFromAccountBalanceLbl = new Label();
		statementFromAccountBalanceLbl.setText("Account Balance:");
		statementFromAccountBalanceLbl.setBounds(60, 150, 110, 25);
		statementFromAccountBalanceLbl.setBackground(new Color(136, 207, 157));

		statementFromAccountBalanceTf = new TextField();
		statementFromAccountBalanceTf.setBounds(160, 150, 200, 25);
		statementFromAccountBalanceTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// Account Name
		transferFromAccountNameLbl = new Label();
		transferFromAccountNameLbl.setText("Account Name:");
		transferFromAccountNameLbl.setBounds(430, 100, 120, 25);
		transferFromAccountNameLbl.setBackground(new Color(136, 207, 157));

		statementFromAccountNameTf = new TextField();
		statementFromAccountNameTf.setBounds(530, 100, 200, 25);
		statementFromAccountNameTf.setFont(new Font("Arial", Font.PLAIN, 13));


		statementSearchBtn = new Button("Search");
		statementSearchBtn.addActionListener(o);
		statementSearchBtn.setBounds(500, 150, 150, 30);
		statementSearchBtn.setFont(new Font("Arial", Font.PLAIN, 13));
		statementSearchBtn.setBackground(new Color(12, 107, 40));
		statementSearchBtn.setForeground(Color.WHITE);


		backBtn = new Button("<");
		backBtn.addActionListener(o);
		backBtn.setBounds(10, 35, 30, 30);
		backBtn.setFont(new Font("Arial", Font.PLAIN, 30));
		backBtn.setBackground(new Color(12, 107, 40));
		backBtn.setForeground(Color.WHITE);

		frame.add(transferFromAccountNoLbl);
		frame.add(statementFromAccountNoTf);

		frame.add(statementFromAccountBalanceLbl);
		frame.add(statementFromAccountBalanceTf);

		frame.add(transferFromAccountNameLbl);
		frame.add(statementFromAccountNameTf);

		frame.add(statementSearchBtn);
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
