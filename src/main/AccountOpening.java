package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;

import com.toedter.calendar.JDateChooser;

public class AccountOpening {
	JFrame frame;
	TextField aoAccountNameTf, aoAccountNoTf, aoNidTf, aoAddressTf, aoAcTypeTf, aoDepositTf, 
			aoNomineeNameTf, aoNomineeNidTf;
	Label titleLbl, acNameLbl, acNoLbl, dobLbl, nidLbl, addressLbl, acTypeLbl, initialDepositLbl, maturityLbl,
			nomineeNameLbl, nomineeNidLbl;

	Button saveAccountBtn, backBtn;
	JDateChooser dateChooser, aoMaturityTf;

	AccountOpening(JFrame previousFrame) {
		frame = new JFrame("Fin Flow");
		int x = previousFrame.getLocation().x;
		int y = previousFrame.getLocation().y;
		frame.setLocation(x, y);
		OuterListner o = new OuterListner(this);

		titleLbl = new Label();
		titleLbl.setText("Account Opening");
		titleLbl.setBounds(260, 35, 250, 35);
		titleLbl.setFont(new Font("Arial", Font.PLAIN, 32));
		titleLbl.setBackground(new Color(136, 207, 157));

		acNameLbl = new Label();
		acNameLbl.setText("Account Name:");
		acNameLbl.setBounds(60, 100, 90, 25);
		acNameLbl.setBackground(new Color(136, 207, 157));

		aoAccountNameTf = new TextField();
		aoAccountNameTf.setBounds(160, 100, 200, 25);
		aoAccountNameTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// nid
		nidLbl = new Label();
		nidLbl.setText("NID:");
		nidLbl.setBounds(60, 150, 90, 25);
		nidLbl.setBackground(new Color(136, 207, 157));

		aoNidTf = new TextField();
		aoNidTf.setBounds(160, 150, 200, 25);
		aoNidTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// address
		addressLbl = new Label();
		addressLbl.setText("Address:");
		addressLbl.setBounds(60, 200, 90, 25);
		addressLbl.setBackground(new Color(136, 207, 157));

		aoAddressTf = new TextField();
		aoAddressTf.setBounds(160, 200, 200, 25);
		aoAddressTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// Deposit
		initialDepositLbl = new Label();
		initialDepositLbl.setText("Deposit:");
		initialDepositLbl.setBounds(60, 250, 90, 25);
		initialDepositLbl.setBackground(new Color(136, 207, 157));

		aoDepositTf = new TextField();
		aoDepositTf.setBounds(160, 250, 200, 25);
		aoDepositTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// Nominee Name
		nomineeNameLbl = new Label();
		nomineeNameLbl.setText("Nominee Name:");
		nomineeNameLbl.setBounds(60, 300, 90, 25);
		nomineeNameLbl.setBackground(new Color(136, 207, 157));

		aoNomineeNameTf = new TextField();
		aoNomineeNameTf.setBounds(160, 300, 200, 25);
		aoNomineeNameTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// account no
		acNoLbl = new Label();
		acNoLbl.setText("Account No:");
		acNoLbl.setBounds(430, 100, 90, 25);
		acNoLbl.setBackground(new Color(136, 207, 157));

		aoAccountNoTf = new TextField();
		aoAccountNoTf.setBounds(520, 100, 200, 25);
		aoAccountNoTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// dob
		dobLbl = new Label();
		dobLbl.setText("Account No:");
		dobLbl.setBounds(430, 150, 90, 25);
		dobLbl.setBackground(new Color(136, 207, 157));

		dateChooser = new JDateChooser();
		dateChooser.setBounds(520, 150, 200, 25);
		dateChooser.setFont(new Font("Arial", Font.PLAIN, 13));
		dateChooser.setBackground(new Color(136, 207, 157));

		// account type
		acTypeLbl = new Label();
		acTypeLbl.setText("Account Type:");
		acTypeLbl.setBounds(430, 200, 90, 25);
		acTypeLbl.setBackground(new Color(136, 207, 157));

		aoAcTypeTf = new TextField();
		aoAcTypeTf.setBounds(520, 200, 200, 25);
		aoAcTypeTf.setFont(new Font("Arial", Font.PLAIN, 13));

		// Maurity Date
		maturityLbl = new Label();
		maturityLbl.setText("Maturity Date:");
		maturityLbl.setBounds(430, 250, 90, 25);
		maturityLbl.setBackground(new Color(136, 207, 157));
		
		aoMaturityTf = new JDateChooser();
		aoMaturityTf.setBounds(520, 250, 200, 25);
		aoMaturityTf.setFont(new Font("Arial", Font.PLAIN, 13));
		aoMaturityTf.setBackground(new Color(136, 207, 157));
		

		// Nominee NID
		nomineeNidLbl = new Label();
		nomineeNidLbl.setText("Nominee NID:");
		nomineeNidLbl.setBounds(430, 300, 90, 25);
		nomineeNidLbl.setBackground(new Color(136, 207, 157));

		aoNomineeNidTf = new TextField();
		aoNomineeNidTf.setBounds(520, 300, 200, 25);
		aoNomineeNidTf.setFont(new Font("Arial", Font.PLAIN, 13));

		saveAccountBtn = new Button("Save Account");
		saveAccountBtn.addActionListener(o);
		saveAccountBtn.setBounds(310, 360, 150, 40);
		saveAccountBtn.setFont(new Font("Arial", Font.PLAIN, 13));
		saveAccountBtn.setBackground(new Color(12, 107, 40));
		saveAccountBtn.setForeground(Color.WHITE);
		
		
		backBtn = new Button("<");
		backBtn.addActionListener(o);
		backBtn.setBounds(10, 35, 30, 30);
		backBtn.setFont(new Font("Arial", Font.PLAIN, 30));
		backBtn.setBackground(new Color(12, 107, 40));
		backBtn.setForeground(Color.WHITE);

		frame.add(acNameLbl);
		frame.add(aoAccountNameTf);

		frame.add(nidLbl);
		frame.add(aoNidTf);

		frame.add(addressLbl);
		frame.add(aoAddressTf);

		frame.add(initialDepositLbl);
		frame.add(aoDepositTf);

		frame.add(nomineeNameLbl);
		frame.add(aoNomineeNameTf);

		frame.add(acNoLbl);
		frame.add(aoAccountNoTf);

		frame.add(dobLbl);
		frame.add(dateChooser);

		frame.add(acTypeLbl);
		frame.add(aoAcTypeTf);

		frame.add(maturityLbl);
		frame.add(aoMaturityTf);
		
		frame.add(nomineeNidLbl);
		frame.add(aoNomineeNidTf);

		frame.add(saveAccountBtn);
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
