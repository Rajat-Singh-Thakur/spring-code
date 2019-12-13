package CollectionList1;

public class Answer {
	private String answer,answerby,answerdate;

	public String toString(){
		return "option choosed:-"+answer+"\nBy:-"+answerby+"\nDate:-"+answerdate;
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

	public String getAnswerdate() {
		return answerdate;
	}

	public void setAnswerdate(String answerdate) {
		this.answerdate = answerdate;
	}

}
