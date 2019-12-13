package DependentObject;

public class Student {
	private int id;
	private String name;
	private String email;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	public void MyMethod(){
		System.out.println("Student Detail:- \nID:-"+id+"\nName:-"+name+"\nEmail:-"+email);
		System.out.println("\nAddress:- \n"+address.toString());
	}

}
