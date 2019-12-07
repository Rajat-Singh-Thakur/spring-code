package com.Spring.Example7;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String question;
	private List<Answer> answer;
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
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	public Question(int id,String question,List<Answer> answer){
		this.id=id;
		this.question=question;
		this.answer=answer;
	}
	
    public void MyMethod(){
    	System.out.println(id+". "+question);
    	Iterator<Answer> itr=answer.iterator();
    	while(itr.hasNext()){
    	  System.out.println(itr.next());	
    	}
    }
}

