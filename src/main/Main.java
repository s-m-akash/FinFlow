package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		DBHelper dbHelper = new DBHelper();
		Connection connection = dbHelper.getConnection();
	//	new LogIn();
		JFrame previoousFrame = new JFrame();
		new AccountOpening(previoousFrame);

		try {
			Statement statement = connection.createStatement();
			String selectQuery = "SELECT * FROM user_master";
			ResultSet resultSet = statement.executeQuery(selectQuery);
			while (resultSet.next()) {
				String id = resultSet.getString("USER_ID");
				String name = resultSet.getString("USER_NAME");
				System.out.println("USER_ID: " + id + ", USER_NAME: " + name);
			}

			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbHelper.closeConnection();
		}
	}

}
