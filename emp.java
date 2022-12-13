package lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class emp {
String id,name,age;
	
	emp(String u,String n,String a){
		this.id=u;
		this.name=n;
		this.age=a;
	}
	public void show() {
		System.out.println("usn="+id+"name="+name+"age="+age);
	}
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList<emp> li=new LinkedList<emp>();
		while(true) {
			System.out.println("1-create \n 2-display\n3-remove\n4-sort \n 5-update 6-size\n7-search 8-clear\n 9-exit \n 10-addfirst\n 11-addlast \n 12-removefirst \n 13-remove last \n");
			System.out.println("enter the choice");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("Enter the id");
				String u=sc.next();
				System.out.println("Enter the name");
				String n=sc.next();
				System.out.println("Enter the age");
				String a=sc.next();
				li.add(new emp(u,n,a));
			}
			else if(ch==2) {
				Iterator<emp> it=li.iterator();
				while(it.hasNext()) {
					it.next().show();
				}
			}
			else if(ch==3) {
				System.out.println("Enter the id");
				String u=sc.next();
				for(emp st:li) {
					if(st.id.equals(u)) {
						li.remove(st);
					}
				}
			}
			else if(ch==4) {
				
				//List <String> li1=new ArrayList<String>();
				//Collections.sort(li);
				

			}
			else if(ch==5) {
				System.out.println("Enter the id");
				String u=sc.next();
				for(emp st:li) {
					if(st.id.equals(u)) {
						System.out.println("Enter the name");
						String n=sc.next();
						st.name=n;
						System.out.println("Enter the age");
						String a=sc.next();
						st.age=a;
					}
				}
			}
			else if(ch==6) {
				System.out.println(li.size());
			}
			else if(ch==7) {
				System.out.println("Enter the id");
				String u=sc.next();
				System.out.println(li);
				for(emp st:li) {
					if(st.id.equals(u)) {
						System.out.println("present");
					}
					else {
						System.out.println("not present");
					}
				}
				
//				boolean sc1=li.contains(u);
//				if(sc1) {
//					System.out.println("present");
//				}
//				else {
//					System.out.println("not present");
//				}
//				
				
			}
			else if(ch==8) {
				li.clear();
			}
			else if(ch==9) {
				System.out.println("exiting...");
				break;
			}
			else if(ch==10) {
				System.out.println("Enter the id");
				String u=sc.next();
				System.out.println("Enter the name");
				String n=sc.next();
				System.out.println("Enter the age");
				String a=sc.next();
				li.addFirst(new emp(u,n,a));
			}
			else if(ch==11) {
				System.out.println("Enter the id");
				String u=sc.next();
				System.out.println("Enter the name");
				String n=sc.next();
				System.out.println("Enter the age");
				String a=sc.next();
				li.addLast(new emp(u,n,a));
			}
			else if(ch==12) {
				
				li.removeFirst();
			}
			else if(ch==13) {
				
				li.removeLast();
			}
			else {
				System.out.println("Invalid");
			}
		}
	}
}
