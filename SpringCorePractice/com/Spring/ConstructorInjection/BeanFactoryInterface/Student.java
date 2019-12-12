package BeanFactoryInterface;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void MyMethod(){
		System.out.println("My Name :- "+name);
	}

}
