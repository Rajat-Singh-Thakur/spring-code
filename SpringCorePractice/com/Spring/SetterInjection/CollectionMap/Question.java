package CollectionMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String question;
	private Map<String,String> answer;
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
	public Map<String, String> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}
	public void MyMethod(){
		System.out.println("Q.no "+id+" "+question+"\nAnswers:-");
		Set<Entry<String,String>> set=answer.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		while(itr.hasNext()){
			Entry<String,String> ent=itr.next();
			System.out.println("ans:- "+ent.getKey()+"  by:-"+ent.getValue());
		}
	}

}
