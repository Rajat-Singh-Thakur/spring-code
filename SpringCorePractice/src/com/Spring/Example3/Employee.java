package com.Spring.Example3;

public class Employee {
	private int id;
	private String name;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Employee(){
		System.out.println("Empty Constructor call");
	}
	
	public Employee(int id){
		this.id=id;		
	}
	
	public Employee(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void MyMethod(){
		System.out.println("Employee Detail :-\n ID:- "+id+"\n name:- "+name+"\n address:- "+address);
	}
	
}
