package maven2.mavenMany;



import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class Main2 {
	
public static void save1() {
		
		SessionFactory sf= new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx= s.beginTransaction();
		
		Student q=new Student();
	  
		q.setId("3");
		q.setSname("ram");
		
		Laptop lt =new Laptop();
		lt.setId("31");
		lt.setName("hp");
		
	    //st.getLaptop().add(lt);
	    
	    Laptop lt1 =new Laptop();
		lt1.setId("32");
		lt1.setName("Dell");
		
		List<Laptop> l1= new ArrayList<Laptop>();
		l1.add(lt);
		l1.add(lt1);
		q.setLaptop(l1);
		 s.save(q);
		 s.save(lt);
		 s.save(lt1);
		   // s.save(lt1);
		    tx.commit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		save1();
		
		
	}

}
