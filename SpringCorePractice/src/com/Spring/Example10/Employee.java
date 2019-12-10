package com.Spring.Example10;

public class Employee {
    private int id;
    private String name;
    private String email;
    private Department department;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Employee(int id,String name,String email){
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	public Employee(int id,String name,String email,Department department){
		this.id=id;
		this.name=name;
		this.email=email;
		this.department=department;
	}
	
	public void MyMethod(){
		System.out.println("name:- "+name+" email:- "+email+" department:- "+department);
	}

}
