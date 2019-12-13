package CollectionList1;

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
    public void MyMethod(){
    	System.out.println("Q.no:-"+id+" "+question+"\nAnswers:-");
    	Iterator<Answer> itr=answer.iterator();
    	while(itr.hasNext()){
    		System.out.println(itr.next()+"\n");
    	}
    }
}
