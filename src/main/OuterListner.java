package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

public class OuterListner implements ActionListener {
	Object g;
	DBHelper dbHelper;
	Connection connection;
	JFrame previoousFrame;

	public OuterListner(Object g) {
		super();
		this.g = g;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dbHelper = new DBHelper();
		connection = dbHelper.getConnection();
		
		if (e.getActionCommand().equals("LogIn")) {
			String userId = ((LogIn) g).userIdTf.getText();
			String password = ((LogIn) g).password.getText();
			System.out.println("UserId:" + userId + "\nPassword:" + password);
			try {
				Statement statement = connection.createStatement();
				String selectQuery = "SELECT COUNT(*) LOGGEDIN FROM user_master WHERE USER_ID ='" + userId
						+ "' AND PASSWORD ='" + password + "' AND STATUS = 'A'";
				ResultSet resultSet = statement.executeQuery(selectQuery);
				while (resultSet.next()) {
					String id = resultSet.getString("LOGGEDIN");
					if (id.equals("1")) {
						System.out.println("Logged In successfull!");
						((LogIn) g).loginMsg.setText("Logged In successfull!");
						Thread.sleep(1000);
						previoousFrame = ((LogIn) g).frame;
						((LogIn) g).frame.dispose();
						new Modules(previoousFrame);
					} else {
						((LogIn) g).loginMsg.setText("Wrong username or password!");
					}
				}

				resultSet.close();
				statement.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			} finally {
				dbHelper.closeConnection();
			}
		} 
		else if (e.getActionCommand().equals("Account Open")) {
			previoousFrame = ((Modules) g).frame;
			((Modules) g).frame.dispose();
			new AccountOpening(previoousFrame);
		}
		else if (e.getActionCommand().equals("<")) {
			previoousFrame = ((AccountOpening) g).frame;
			((AccountOpening) g).frame.dispose();
			new Modules(previoousFrame);
		}
		
		else if (e.getActionCommand().equals("Logout")) {
			((Modules) g).frame.dispose();
			new LogIn();
		}
	}

}
