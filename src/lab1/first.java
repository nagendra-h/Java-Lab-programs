package lab1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class first {
	Map<String,String> m1=new HashMap<>();
	public void create(String st,String cap) {
		
		m1.put(st, cap);
	}
	public void dis() {
		Iterator<String> it=m1.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println("key="+key+"value="+m1.get(key));
		}
	}
	public void remove(String key) {
		m1.remove(key);
	}
	public void update(String key,String value) {
		m1.put(key, value);
	}
	
	public void sort() {
		TreeMap<String,String> it1=new TreeMap<String,String>(m1);
		Iterator<String> it=it1.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println("key="+key+"value="+m1.get(key));
		}
		
		
		}    
	
	
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first fi=new first();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1- create \n 2-display \n 3-remove \n 4-update \n 5-sort \n 6-search \n7-size \n 8- clear \n 9-exit");
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
				fi.sort();
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
			else {
				System.out.println("invalid option");
			}
	}
	}
}


