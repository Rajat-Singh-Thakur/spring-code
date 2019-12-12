package CIwithCollectionMap;

import java.util.Map;

public class Student {
	private int id;
	private String name;
	private Map<String,String> answer;
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
	public Map<String, String> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}
	
	public Student(int id,String name,Map<String,String>answer) {
		this.id=id;
		this.name=name;
		this.answer=answer;
	}
	
	public void MyMethod() {
		System.out.println("Q "+id+". "+name+"\n"+answer);
	}

}
