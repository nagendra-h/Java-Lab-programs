package maven2.mavenMany;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CascadeType;


@Entity
public class Student {

		@Id
		//@GeneratedValue(strategy=GenerationType.TABLE)  
		private String id;
		private String sname;
		
		 @OneToMany
		
		private List<Laptop> Laptop =new ArrayList<Laptop>(); 
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public List<Laptop> getLaptop() {
			return Laptop;
		}

		public void setLaptop(List<Laptop> laptop) {
			Laptop = laptop;
		}

		
}
