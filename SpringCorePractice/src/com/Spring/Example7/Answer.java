package com.Spring.Example7;

public class Answer {
	private int id;
	private String answer;
	private String answerby;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswerby() {
		return answerby;
	}
	public void setAnswerby(String answerby) {
		this.answerby = answerby;
	}
	
	public Answer(int id,String answer,String answerby){
		this.id=id;
		this.answer=answer;
		this.answerby=answerby;
	}
	
	public String toString(){
		return id+" "+answerby+" \n answer:- "+answer;
	}

}
