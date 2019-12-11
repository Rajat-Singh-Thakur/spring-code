package com.Spring.Example11;

public class Employee {
	private int id;
	private String name;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(int id,String name,String email){
		this.id=id;
		this.name=name;
		this.email=email;
	}
	public Employee(){
		
	}
	public void MyMethod()
	{
		System.out.println(id+" "+name+" "+email);
	}

}
