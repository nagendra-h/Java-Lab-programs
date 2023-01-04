package pack1;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon;
class Student{
	public int rno;
	public String name;
	Student(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
	public void show() {
		System.out.println(rno + name);
	}
	public static <T> void indexOf1(List<T> st1,T object) {
		for(int i=0;i< st1.size();i++) {
			if(object.equals(st1.get(i))) {
				System.out.println("found");
			}
		}
		System.out.println("not found");
	}
}
public class p1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1- list \n 2-String \n 3-iterator \n 4-object creation \n 5-Linked List \n");
			System.out.println("choose the choice");
			int ch=sc.nextInt();
			if(ch==1) {
				List <String> li=new ArrayList<String>();
				li.add("Karnataka");
				li.add("Andrapradesh");
				li.add("Tamilnadu");
				li.add("Kerala");
				li.add("Goa");
				System.out.println("------------after adding (li)");
				for(int i=0;i<li.size();i++) {
					System.out.println(li.get(i));
				}
				
				// remove is used 
				li.remove(0);
				System.out.println("element is removed");
				List <String> li1=new ArrayList<String>(li);
				
				System.out.println("------------after adding (li1)");
				for(int i=0;i<li1.size();i++) {
					System.out.println(li1.get(i));
				}
				List <String> li2=new ArrayList<String>();
				
				li2.add("Karnataka");
				for(int i=0;i<li2.size();i++) {
					System.out.println(li2.get(i));
				}
				// clear method is used 
				li2.clear();
				// add all is used
				li2.addAll(li1);
				// set is used
				li2.set(3,"karnataka");
				
				// add at the particular position
				System.out.println("added at 4 position");
				li2.add(4, "goa");
				System.out.println("------------after adding (li2)");
				for(int i=0;i<li2.size();i++) {
					System.out.println(li2.get(i));
				}
				// remove all is used
				li1.removeAll(li1);
				// isEmpty is used
				if(li1.isEmpty()) {
					System.out.println("li1 is empty");
				}
				if(li.contains("Goa")){
					System.out.println("contains is used");
				}
				System.out.println("sort");
				Collections.sort(li);
				for(int i=0;i<li.size();i++) {
					System.out.println(li.get(i));
				}
				
			}
			else if(ch==2) {
				String[] a1= {"a1","a2","a3"};
				List <String> li3= new ArrayList<String>(Arrays.asList(a1));
				for(int i=0;i<li3.size();i++) {
					System.out.println(li3.get(i));
				}
			}
			else if(ch==3) {
				List <String> li=new ArrayList<String>();
				li.add("Karnataka");
				li.add("Andrapradesh");
				li.add("Tamilnadu");
				li.add("Kerala");
				li.add("Goa");
				Iterator <String> it=li.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				List <String> li1=new ArrayList<String>(li);
				Iterator <String> it1=li1.iterator();
				while(it1.hasNext()) {
					System.out.println(it1.next());
				}
			}
			
			else if(ch==4) {
				List <Student> st=new ArrayList<Student>();
				st.add(new Student(123,"ram"));
				st.add(new Student(124,"raj"));
				st.add(new Student(124,"aaj"));
				st.add(new Student(124,"aaa"));
				// using the object
				Student st2 =new Student(1,"mahesh");
				st.add(st2);
				Collections.sort(st,new Comparator<Student>(){
					
					public int compare(Student s,Student s1) {
						return s.name.compareTo(s1.name);
					}
				});
				System.out.println("sorted++++++++++++");
				System.out.println(st);
				Iterator <Student> it1=st.iterator();
				while(it1.hasNext()) {
					it1.next().show();
					//Student s1=it1.next();
					//s1.show();
					//System.out.println(it1.next().name);
					//System.out.println(it1.next().rno);
					
				}
				System.out.println();
				
			}
			else if(ch==5) {
				LinkedList <String> li=new LinkedList<String>();
				li.add("1");
				li.add("2");
				li.add("3");
				Iterator <String> it=li.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				li.addFirst("0");
				li.addLast("4");
				Iterator <String> it1=li.iterator();
				System.out.println("---------after -----------");
				while(it1.hasNext()) {
					System.out.println(it1.next());
				}
				li.removeFirst();
				li.removeLast();
				System.out.println("------after ---------");
				Iterator <String> it2=li.iterator();
				while(it2.hasNext()) {
					System.out.println(it2.next());
				}
			}
		}
		
	}

}
