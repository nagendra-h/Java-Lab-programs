package q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class Mainclass {
	
	
	   
	public static void save1(String s1,String s2,String s3,String s4) {
		
		SessionFactory sf= new Configuration().configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class).buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx= s.beginTransaction();
		
		Question q=new Question();
	  
		q.setId(s1);
		q.setQuestion(s2);
		
		Answer ans= new Answer();
		ans.setIds(s3);
		ans.setAns(s4);
	
		q.setAnswer(ans);	
	    s.save(q);
	    s.save(ans);
	    tx.commit();
	}
	
	public static  void delete1(String id) {
		
		Question q=new Question();
		 Answer ans= new Answer(); 
		ans.setIds(id);
		SessionFactory sf= new Configuration().configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class).buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction tx= s.beginTransaction();
	
		s.delete(ans);
		tx.commit();
		
	}
	
	public static  void update(String id,String Question) {
		Question f1=new Question();
		f1.setId(id);
		f1.setQuestion(Question);
		SessionFactory sf= new Configuration().configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class).buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx= s.beginTransaction();
		s.saveOrUpdate(f1);
		tx.commit();
		
	}
	public static void display() {
		Question f1=new Question();
		
		SessionFactory sf= new Configuration().configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class).buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx= s.beginTransaction();
		
		org.hibernate.query.Query q=s.createQuery("from Question");
		List<Question> l =(List<Question>) ((org.hibernate.query.Query) q).list();
	
		
		Iterator it = l.iterator();
		System.out.println("List of Questions:");
		while (it.hasNext()) {
			f1 = (Question) it.next();
			System.out.println(f1.toString());
			//System.out.println(it.next().toString());
		}
		
		Answer a=new Answer();
		org.hibernate.query.Query q1=s.createQuery("from Answer");
		List<Answer> l1 =(List<Answer>) ((org.hibernate.query.Query) q1).list();
	
		
		Iterator it1 = l1.iterator();
		System.out.println("List of Answers:");
		while (it1.hasNext()) {
			a = (Answer) it1.next();
			System.out.println(a.toString());
			//System.out.println(it.next().toString());
		}
		tx.commit();
	}

	public static void main(String[] args) throws IOException {
		
		Mainclass f =new Mainclass();
		 Scanner sc=new Scanner(System.in);
		 BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));
		 
		while(true) {

	    	System.out.println("1-insert \n 2-delete \n 3-update \n 4-display \n 5-exit \n");
	    	System.out.println("enter choice");
	    	int i= sc.nextInt();
	    	if(i==1) {
	    		System.out.println("enter the id");
	    		String s=sc.next();
	    		System.out.println("enter the question");
	    		String s1=rd.readLine();
	    		
	    		System.out.println("enter the id");
	    		String s2=sc.next();
	    		System.out.println("enter the question");
	    		String s3=rd.readLine();
	    		save1(s,s1,s2,s3);
	    			
	    			
	    			
	    	}
	    	else if(i ==2 ) {
	    		System.out.println("enter the id");
	    		String s1=sc.next();
	    		delete1(s1);
	    		
	    	}
	    	else if(i==3) {
	    		System.out.println("enter the id");
	    		String s=sc.next();
	    		System.out.println("enter the Question");
	    		String s1=sc.nextLine();
	    		update(s,s1);
	    	}
	    	else if(i==4) {
	    		display();
	    	}
	    	else if(i==5) {
	    		System.out.println("exiting..");
	    		break;
	    	}
	    	else {
	    		System.out.println("invalid choice");
	    	}
	    }
		
		
		
		
	
//		SessionFactory sf= new Configuration().configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class).buildSessionFactory();
//		Session s=(Session) ss();
//		Transaction tx= s.beginTransaction();
//		
//		Question q=new Question();
//	
//    
//    Question q1= new Question();
//	q1.setId("2");
//	q1.setQuestion("What is python?");
//	
//	Answer ans1= new Answer();
//	ans1.setIds("22");
//	ans1.setAns("Pyhton is programing Language");
//	
//    s.save(q1);
//    s.save(ans1);
//    tx.commit();
    
}
}
