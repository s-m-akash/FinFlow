package main;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;

public class FundTransfer {
	JFrame frame;
	TextField transferFromAccountNoTf, transferFromAccountNameTf, transferFromAccountBalanceTf, transferFromAmountTf, transferToAccountNoTf, transferToAccountNameTf;
	Label titleLbl, transferFromAccountNoLbl, transferFromAccountNameLbl, transferFromAccountBalanceLbl, transferFromAmountLbl,transferToAccountNoLbl, transferToAccountNameLbl;

	Button saveTransferBtn, backBtn;

	FundTransfer(JFrame previousFrame) {
		frame = new JFrame("FinFlow Banking System");
		int x = previousFrame.getLocation().x;
		int y = previousFrame.getLocation().y;
		frame.setLocation(x, y);
		OuterListner o = new OuterListner(this);

		titleLbl = new Label();
		titleLbl.setText("Fund Transfer");
		titleLbl.setBounds(300, 35, 250, 35);
		titleLbl.setFont(new Font("Arial", Font.PLAIN, 32));
		titleLbl.setBackground(new Color(136, 207, 157));

		transferFromAccountNoLbl = new Label();
		transferFromAccountNoLbl.setText("From Account No:");
		transferFromAccountNoLbl.setBounds(60, 100, 110, 25);
		transferFromAccountNoLbl.setBackground(new Color(136, 207, 157));

		transferFromAccountNoTf = new TextField();
		transferFromAccountNoTf.setBounds(160, 100, 200, 25);
		transferFromAccountNoTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// account balance
		transferFromAccountBalanceLbl = new Label();
		transferFromAccountBalanceLbl.setText("Account Balance:");
		transferFromAccountBalanceLbl.setBounds(60, 150, 110, 25);
		transferFromAccountBalanceLbl.setBackground(new Color(136, 207, 157));

		transferFromAccountBalanceTf = new TextField();
		transferFromAccountBalanceTf.setBounds(160, 150, 200, 25);
		transferFromAccountBalanceTf.setFont(new Font("Arial", Font.PLAIN, 13));

		transferToAccountNoLbl = new Label();
		transferToAccountNoLbl.setText("To Account No:");
		transferToAccountNoLbl.setBounds(60, 200, 110, 25);
		transferToAccountNoLbl.setBackground(new Color(136, 207, 157));

		transferToAccountNoTf = new TextField();
		transferToAccountNoTf.setBounds(160, 200, 200, 25);
		transferToAccountNoTf.setFont(new Font("Arial", Font.PLAIN, 13));


		// Account Name
		transferFromAccountNameLbl = new Label();
		transferFromAccountNameLbl.setText("From Account Name:");
		transferFromAccountNameLbl.setBounds(430, 100, 120, 25);
		transferFromAccountNameLbl.setBackground(new Color(136, 207, 157));

		transferFromAccountNameTf = new TextField();
		transferFromAccountNameTf.setBounds(530, 100, 200, 25);
		transferFromAccountNameTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// Deposit Amount
		transferFromAmountLbl = new Label();
		transferFromAmountLbl.setText("Transfer Amount:");
		transferFromAmountLbl.setBounds(430, 150, 120, 25);
		transferFromAmountLbl.setBackground(new Color(136, 207, 157));

		transferFromAmountTf = new TextField();
		transferFromAmountTf.setBounds(530, 150, 200, 25);
		transferFromAmountTf.setFont(new Font("Arial", Font.PLAIN, 13));


		transferToAccountNameLbl = new Label();
		transferToAccountNameLbl.setText("To Account Name");
		transferToAccountNameLbl.setBounds(430, 200, 120, 25);
		transferToAccountNameLbl.setBackground(new Color(136, 207, 157));

		transferToAccountNameTf = new TextField();
		transferToAccountNameTf.setBounds(530, 200, 200, 25);
		transferToAccountNameTf.setFont(new Font("Arial", Font.PLAIN, 13));

		saveTransferBtn = new Button("Save");
		saveTransferBtn.addActionListener(o);
		saveTransferBtn.setBounds(310, 260, 150, 40);
		saveTransferBtn.setFont(new Font("Arial", Font.PLAIN, 13));
		saveTransferBtn.setBackground(new Color(12, 107, 40));
		saveTransferBtn.setForeground(Color.WHITE);


		backBtn = new Button("<");
		backBtn.addActionListener(o);
		backBtn.setBounds(10, 35, 30, 30);
		backBtn.setFont(new Font("Arial", Font.PLAIN, 30));
		backBtn.setBackground(new Color(12, 107, 40));
		backBtn.setForeground(Color.WHITE);

		frame.add(transferFromAccountNoLbl);
		frame.add(transferFromAccountNoTf);

		frame.add(transferFromAccountBalanceLbl);
		frame.add(transferFromAccountBalanceTf);

		frame.add(transferFromAccountNameLbl);
		frame.add(transferFromAccountNameTf);

		frame.add(transferFromAmountLbl);
		frame.add(transferFromAmountTf);

		frame.add(transferToAccountNoLbl);
		frame.add(transferToAccountNoTf);

		frame.add(transferToAccountNameLbl);
		frame.add(transferToAccountNameTf);

		frame.add(saveTransferBtn);
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
