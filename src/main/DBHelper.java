package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/finflowdb";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";

	private Connection connection;

	public DBHelper() {
		try {
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static ResultSet executeQuery(String query) {
		DBHelper dbHelper = new DBHelper();
		Connection connection = dbHelper.getConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			//resultSet.close();
			//statement.close();
			return resultSet;
			
		} catch (SQLException se) {
			se.printStackTrace();
		}  finally {
			dbHelper.closeConnection();
		}
		return null;
	}

}
