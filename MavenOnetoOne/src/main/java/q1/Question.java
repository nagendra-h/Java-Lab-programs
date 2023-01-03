package q1;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;



@Entity

public class Question {

		@Id
		public String id;
		
		public String question;
		public Answer getAnswer() {
			return answer;
		}
	 
		public void setAnswer(Answer answer) {
			this.answer = answer;
		}

		@OneToOne
		private Answer answer;
	
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		@Override
		public String toString() {
			return "Question [id=" + id + ", question=" + question + ", answer=" + answer + "]";
		}

		
		
		
}
