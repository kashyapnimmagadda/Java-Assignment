package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.model.User;

public class UserDaoImpl implements UserDao {

	public Connection getConnection() {
		Connection con = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/labassignment",
							"list", "list");
			System.out.println("CONNECTED!!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return con;
	}

	@Override
	public String createUser(User userInput) {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		String result = null;
		try {
			preparedStatement = connection
					.prepareStatement("insert into users values (?,?,?,?)");
			preparedStatement.setInt(1, userInput.getUserId());
			preparedStatement.setString(2, userInput.getUserName());
			preparedStatement.setInt(3, userInput.getUserAge());
			preparedStatement.setString(4, userInput.getUserCity());
			result = "updated";
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	@Override
	public User getUserById(int userId) {
		User user = new User();
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			preparedStatement = connection
					.prepareStatement("select * from users where userid = ?");
			preparedStatement.setInt(1, userId);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user.setUserId(resultSet.getInt("userid"));
				user.setUserName(resultSet.getString("username"));
				user.setUserAge(resultSet.getInt("userage"));
				user.setUserCity(resultSet.getString("usercity"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return user;
	}

	@Override
	public User getUserByName(String userName) {
		User user = new User();
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			preparedStatement = connection
					.prepareStatement("select * from users where username = ?");
			preparedStatement.setString(1, userName);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user.setUserId(resultSet.getInt("userid"));
				user.setUserName(resultSet.getString("username"));
				user.setUserAge(resultSet.getInt("userage"));
				user.setUserCity(resultSet.getString("usercity"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return user;
	}

	@Override
	public User getUserByIdAndCity(int userId, String userCity) {
		User user = new User();
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			preparedStatement = connection
					.prepareStatement("select * from users where userid = ? and usercity =?");
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(2, userCity);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user.setUserId(resultSet.getInt("userid"));
				user.setUserName(resultSet.getString("username"));
				user.setUserAge(resultSet.getInt("userage"));
				user.setUserCity(resultSet.getString("usercity"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return user;
	}

}
