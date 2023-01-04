package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class wild2 {

	
	
	public static double sum(List<? extends Number> list) {
		double sum=0.0;
		for(Number i:list) {
			sum+=i.doubleValue();
		}
		return sum;
		
	}
	
//	public static void sum1(LinkedList<? extends List> list1) {
//		double sum=0.0;
//		for(List i:list1) {
//			System.out.println(i);
//		}
//		
//	}
	
	static void print2(List<?> li) {
		System.out.println(li);
	}
	static<T> void  print4(T obj){
		System.out.println(obj);
	}
	static void p1(List<? super Integer> lw) {
		System.out.println(lw);;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> list2=Arrays.asList(4.1,2.3,4.5);
		System.out.println("values="+sum(list2));
		List<Integer> list1=Arrays.asList(4,1,2,3,4,5);
		System.out.println("values="+sum(list1));
//		LinkedList<List> k=new LinkedList<List>();
//		sum1(k);
		print2(list2);
//		Not working with List type 
		int a=10;
//		print2(a);
		
		print4(a);
		print4(list1);
		p1(list1);
		List<Number> lk=new ArrayList<Number>();
		lk.add(1);
		lk.add(2);
		p1(lk);

	}

}
