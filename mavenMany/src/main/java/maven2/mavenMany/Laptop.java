package maven2.mavenMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Laptop {

		@Id
		
		//@GeneratedValue(strategy=GenerationType.TABLE)  
		private String id;
		private String name;
		
		 @ManyToOne
	// @Cascade(value={org.hibernate.annotations.CascadeType.ALL})
		 public Student student;
		@Override
		public String toString() {
			return "Laptop [id=" + id + ", name=" + name + ", student=" + student + "]";
		}
		public Student getStudent() {
			return student;
		}
		public void setStudent(Student student) {
			this.student = student;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}
