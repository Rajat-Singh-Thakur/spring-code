package com.Spring.Example5;

public class Address {
	private String city;
	private String state;
	private String nation;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public Address(String city,String state,String nation){
		this.city=city;
		this.state=state;
		this.nation=nation;
	}
	
	public String toString(){
		return "Address:- \n city:-"+city+"\n state:-"+state+"\n nation:-"+nation;
	}

}
