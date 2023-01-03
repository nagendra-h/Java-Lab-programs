package q1;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="answer")
public class Answer {

		@Id
		//@OnDeleteaction=OnDeleteAction.CASCADE)
		public String ids;
		
		public String ans;
		public String getIds() {
			return ids;
		}
		public void setIds(String ids) {
			this.ids = ids;
		}
		public String getAns() {
			return ans;
		}
		public void setAns(String ans) {
			this.ans = ans;
		}
		@Override
		public String toString() {
			return "Answer [ids=" + ids + ", ans=" + ans + "]";
		}
		
		
}
