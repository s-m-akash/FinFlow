package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class LogIn {
	JFrame frame;
	Label title, userIdLbl, passwordLbl, loginMsg;
	TextField userIdTf;
	JPasswordField password;
	Button loginBtn;

	LogIn() {

		int x = 300, y = 100;
		if (frame != null) {
			x = frame.getLocation().x;
			y = frame.getLocation().y;
		}

		frame = new JFrame("Fin Flow");
		frame.setLocation(x, y);
		// Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// int centerX = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
		// int centerY = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);
		// frame.setLocation(centerX, centerY);

		OuterListner o = new OuterListner(this);

		title = new Label();
		title.setText("Fin Flow");
		title.setBounds(315, 130, 155, 30);
		title.setFont(new Font("Arial", Font.PLAIN, 40));
		title.setBackground(new Color(136, 207, 157));

		userIdLbl = new Label();
		userIdLbl.setText("User Id:");
		userIdLbl.setBounds(250, 200, 75, 30);
		userIdLbl.setFont(new Font("Arial", Font.PLAIN, 15));
		userIdLbl.setBackground(new Color(136, 207, 157));

		passwordLbl = new Label();
		passwordLbl.setText("Password:");
		passwordLbl.setBounds(250, 250, 75, 30);
		passwordLbl.setFont(new Font("Arial", Font.PLAIN, 15));
		passwordLbl.setBackground(new Color(136, 207, 157));

		userIdTf = new TextField();
		userIdTf.setBounds(330, 200, 200, 30);
		userIdTf.setFont(new Font("Arial", Font.PLAIN, 20));

		password = new JPasswordField();
		password.setBounds(330, 250, 200, 30);
		password.setFont(new Font("Arial", Font.PLAIN, 20));

		loginBtn = new Button("LogIn");
		loginBtn.addActionListener(o);

		loginBtn.setBounds(350, 300, 70, 40);
		loginBtn.setFont(new Font("Arial", Font.PLAIN, 20));
		loginBtn.setBackground(new Color(12, 107, 40));
		loginBtn.setForeground(Color.WHITE);

		loginMsg = new Label();
		loginMsg.setText("");
		loginMsg.setBounds(285, 350, 200, 30);
		loginMsg.setFont(new Font("Arial", Font.PLAIN, 15));
		loginMsg.setBackground(new Color(136, 207, 157));

		frame.add(title);
		frame.add(userIdLbl);
		frame.add(userIdTf);
		frame.add(passwordLbl);
		frame.add(password);
		frame.add(loginBtn);
		frame.add(loginMsg);

		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(136, 207, 157));

	}

}
