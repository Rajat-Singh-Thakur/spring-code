package CIwithCollectionMap1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String question;
	private Map<Answer,User> answers;
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
	public Map<Answer, User> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Answer, User> answers) {
		this.answers = answers;
	}
	
	public Question(int id,String question,Map<Answer,User> answers) {
		this.id=id;
		this.question=question;
		this.answers=answers;
	}
	
	public void MyMethod() {
		System.out.println("QNo."+id);
		System.out.println("Question: "+question);
		Set<Entry<Answer,User>> set=answers.entrySet();
		Iterator <Entry<Answer,User>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<Answer,User> entry=itr.next();
			Answer ans=entry.getKey();
			User usr=entry.getValue();
			System.out.println(ans);
			System.out.println(usr);
		}
	}

}
