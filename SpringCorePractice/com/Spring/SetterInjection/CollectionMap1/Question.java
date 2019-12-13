package CollectionMap1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String question;
	private Map<Answer,User> answer;
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
	public Map<Answer, User> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<Answer, User> answer) {
		this.answer = answer;
	}
	public void MyMethod(){
		System.out.println("Q.no "+id+" "+question+"\nAnswer:-");
		Set<Entry<Answer,User>>set=answer.entrySet();
		Iterator<Entry<Answer,User>> itr=set.iterator();
		while(itr.hasNext()){
			Entry<Answer,User> ent=itr.next();
			Answer ans=ent.getKey();
			User us=ent.getValue();
			System.out.println(ans+" "+us);
		}
	}
}
