package com.model;

public class User {
	private int userId;
	private String userName;
	private int userAge;
	private String userCity;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public User() {
		super();
	}

	public User(int userId, String userName, int userAge, String userCity) {
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userCity = userCity;
	}
}
