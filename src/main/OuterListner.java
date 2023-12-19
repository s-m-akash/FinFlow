package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;

public class OuterListner implements ActionListener {
	Object g;
	DBHelper dbHelper;
	Connection connection;
	JFrame previoousFrame;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	public OuterListner(Object g) {
		super();
		this.g = g;
	}
	
	public void executeInsertQuery(String insertQuery) {
		dbHelper = new DBHelper();
		connection = dbHelper.getConnection();
		try {
			Statement statement = connection.createStatement();
			int rowsAffected = statement.executeUpdate(insertQuery);
			if (rowsAffected > 0) {
                System.out.println("Insertion successful. " + rowsAffected + " rows affected.");
            } else {
                System.out.println("Insertion failed. No rows affected.");
            }
		}
		catch(Exception e) {
			e.printStackTrace();		
			}
	}
	public int saveAccount() {
		String accountName = ((AccountOpening) g).aoAccountNameTf.getText();
		String nid = ((AccountOpening) g).aoNidTf.getText();
		String address = ((AccountOpening) g).aoAddressTf.getText();
		String deposit = ((AccountOpening) g).aoDepositTf.getText();
		String nominee = ((AccountOpening) g).aoNomineeNameTf.getText();
		String dob = dateFormat.format(((AccountOpening) g).aoDob.getDate());
		String accountType = ((AccountOpening) g).aoAcTypeTf.getText();
		String maturityDate = dateFormat.format(((AccountOpening) g).aoMaturityTf.getDate());
		String nomineeNid = ((AccountOpening) g).aoNomineeNidTf.getText();
		String insertQuery = "INSERT INTO accounts (ACCOUNT_NAME, NID, DOB, ADDRESS, initial_deposit, maturity_date, nominee_name, nominee_nid,account_type)\r\n"
				+ "VALUES ('"+accountName+"','"+nid+"','"+dob+"','"+address+"','"+deposit+"','"+maturityDate+"','"+nominee+"','"+nomineeNid+"','"+accountType+"')";
		executeInsertQuery(insertQuery);
		System.out.println(insertQuery);
		
		
		return 0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dbHelper = new DBHelper();
		connection = dbHelper.getConnection();
		
		if (e.getActionCommand().equals("Log in")) {
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
		else if(e.getActionCommand().equals("Save Account")) {
			saveAccount();
			
			
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
