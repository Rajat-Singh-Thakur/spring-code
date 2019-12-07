package com.Spring.Example5;

public class Student {
	private int id;
	private String name;
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Student(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void Mymethod(){
		System.out.println("Employee Details:- \n Id:-"+id+"\n name:-"+name+"\n"+address.toString());
	}

}
