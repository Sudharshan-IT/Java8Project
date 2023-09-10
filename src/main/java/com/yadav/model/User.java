package com.yadav.model;

public class User {
	
	private int id;
	private String userName;
	private String passWord;
	private String email;
	public User(int id, String userName, String passWord, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email + "]";
	}
	
	

}
