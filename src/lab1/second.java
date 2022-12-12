package lab1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class second {

	TreeMap<String,String> m1=new TreeMap<>();
	public void create(String st,String cap) {
		
		m1.put(st, cap);
		
	}
	public void dis() {
		Iterator<String> it=m1.keySet().iterator();
		//while(it.hasNext()) {
			//String key=it.next();
		//	System.out.println("key="+key+"value="+m1.get(key));
		//}
		for(Map.Entry<String, String> m:m1.entrySet()) {
			System.out.println("Key=="+m.getKey()+"Value==="+m.getValue());
		}
	}
	public void remove(String key) {
		m1.remove(key);
	}
	public void update(String key,String value) {
		m1.put(key, value);
	}
//	
//	public void sort() {
//	//	TreeMap<String,String> it1=new TreeMap<String,String>(m1);
//		Iterator<String> it=m1.keySet().iterator();
//		while(it.hasNext()) {
//			String key=it.next();
//			System.out.println("key="+key+"value="+m1.get(key));
//		}
//		
//		
//		}    
	
	
	public void search(String key) {
		if(m1.containsKey(key)) {
			System.out.println("it is present");
		}
		else {
			System.out.println("not present");
		}
	}
	public void size() {
		System.out.println("the size of map is="+m1.size());
	}
	
	public void clear() {
		m1.clear();
		System.out.println("clear");
	}
	public void descending() {
		System.out.println(m1.descendingKeySet());
	}
	public void head(String key) {
		System.out.println(m1.headMap(key));
	}
	public void tail(String key) {
		System.out.println(m1.tailMap(key));
	}
	public void sub(String k1,String k2) {
		System.out.println(m1.subMap(k1, k2));
	}
	public void pollFirst() {
		m1.pollFirstEntry();
	}
	public void pollLast() {
		m1.pollLastEntry();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second fi=new second();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1- create \n 2-display \n 3-remove \n 4-update \n 5-descending \n 6-search \n7-size \n 8- clear \n 9-exit\n10-head \n 11-tail \n 12-sub\n 13-pollFirst \n 14-poll LAst \n");
			System.out.println("choose the choice");
			int ch=sc.nextInt();
			if(ch==1) {
				
				System.out.println("Enter state");
				String state = sc.next();
				System.out.println("Enter capital");
				String capital = sc.next();
				fi.create(state,capital);
			}
			else if(ch==2) {
				fi.dis();
			}
			else if(ch==3) {
				System.out.println("enter the key to delete");
				String key=sc.next();
				fi.remove(key);
			}
			else if(ch==4) {
				System.out.println("Enter state for update");
				String state = sc.next();
				System.out.println("Enter updated capital value");
				String capital = sc.next();
				fi.update(state,capital);
			}
			else if(ch==5) {
				fi.descending();
			}
			else if(ch==6) {
				System.out.println("Enter state");
				String state = sc.next();
				fi.search(state);
			}
			else if(ch==7) {
			   fi.size();
			}
			else if(ch==8) {
				fi.clear();
			}
			else if(ch==9) {
				break;
			}
			else if(ch==10) {
				System.out.println("Enter state");
				String state = sc.next();
				fi.head(state);
			}
			else if(ch==11) {
				System.out.println("Enter state");
				String state = sc.next();
				fi.tail(state);
			}
			else if(ch==12) {
				System.out.println("Enter state for starting");
				String state = sc.next();
				System.out.println("Enter state for ending");
				String state1 = sc.next();
				fi.sub(state,state1);
			}
			else if(ch==13) {
				fi.pollFirst();
			}
			else if(ch==14) {
				fi.pollLast();
			}
			else {
				System.out.println("invalid option");
			}
	}
	}
}
