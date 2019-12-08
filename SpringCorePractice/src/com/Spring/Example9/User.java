package com.Spring.Example9;

public class User {
	private int id;
	private String userName;
	private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User(int id,String userName,String email) {
		this.id=id;
		this.userName=userName;
		this.email=email;
	}
	
	public String toString() {
		return id+" UsertName:- "+userName+" \nEmail:- "+email;
	}
	
}
