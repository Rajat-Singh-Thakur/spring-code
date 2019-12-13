package CollectionMap1;

public class Answer {
	private String answer,answerdate;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswerdate() {
		return answerdate;
	}

	public void setAnswerdate(String answerdate) {
		this.answerdate = answerdate;
	}
	
	Answer(String answer,String answerdate){
		this.answer=answer;
		this.answerdate=answerdate;
	}
	Answer(){
		
	}
	public String toString(){
		return answer+" "+answerdate;
	}

}
