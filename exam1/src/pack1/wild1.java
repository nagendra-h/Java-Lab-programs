package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import pack1.st1;
public class wild1 {

		void print1(Collection<?> c) {
			for(Object e:c) {
				System.out.println(e);
			}
		}
		void print2(Collection<?> c) {
			for(Object e:c) {
				System.out.println(e.getClass().getName());
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {1,2,34};
		String[] b= {"aa","cc"};
		List<Integer> li=new ArrayList<Integer>(Arrays.asList(a));
		wild1 w=new wild1();
		w.print1(li);
		System.out.println("----------------------------------");
		
		LinkedList<String> l1=new LinkedList<String>(Arrays.asList(b));
		w.print1(l1);
		List<st1> s1=new ArrayList<st1>();
		s1.add(new st1(123,"raj"));
		s1.add(new st1(1,"ram"));
		s1.add(new st1(423,"rahul"));
		w.print2(s1);
		

	}

}
