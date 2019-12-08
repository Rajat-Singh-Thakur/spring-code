package com.Spring.Example9;

import java.util.Date;

public class Answer {
	private int id;
	private String answer;
	private Date answerDate;
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
	public Date getAnswerDate() {
		return answerDate;
	}
	public void setAnswerDate(Date answerDate) {
		this.answerDate = answerDate;
	}
	
	public Answer(int id,String answer,Date answerDate) {
		this.id=id;
		this.answer=answer;
		this.answerDate=answerDate;
	}
	
	public String toString() {
		return "Answer:- "+id+". "+answer+" \nDate:-"+answerDate;
	}

}
