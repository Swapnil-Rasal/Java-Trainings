package com.citibank.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.citibank.domain.Login;

public class LoginRepository {
	private String userNm = "root";
	private String pwd = "Root123$";
	private String url = "jdbc:mysql://localhost:3306/citibankdb";;
	private String query;
	private int resultCount;
	int loginAttemptCounter=0;
	private boolean result;
	
	// connection database
	private Connection connection;
	// write-store and execute query
	private PreparedStatement preparedStatement;
	// store data from table
	private ResultSet resultSet;
	
	
	public String getLoginDetails (String loginId, String password) {
		query="Select user_name from login_details where login_id = ? and password = ?";
		try {
			connection = DriverManager.getConnection(url, userNm, pwd);
			if (connection != null) {
				preparedStatement= connection.prepareStatement(query);
				preparedStatement.setString(1, loginId);
				preparedStatement.setString(2, password);
				
				resultSet = preparedStatement.executeQuery();
				
				if(resultSet.next()) {
					String userName = resultSet.getString("user_name");
					return userName;
				}
				else {
					loginAttemptCounter++;
					if(loginAttemptCounter == 3) {
						return "max";
					}
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	
}
