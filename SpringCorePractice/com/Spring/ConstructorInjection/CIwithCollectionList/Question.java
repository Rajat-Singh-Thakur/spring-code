package CIwithCollectionList;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String question;
	private List<String> answer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	
	public Question(int id,String question,List<String>answer){
		this.id=id;
		this.question=question;
		this.answer=answer;
	}
	
	public void MyMethod(){
		System.out.println(id+". "+question+"\n answer:-");
		Iterator<String> itr=answer.iterator();
		int i=0;
		while(itr.hasNext()){
			System.out.println(++i+". "+itr.next());
		}
	}
}
