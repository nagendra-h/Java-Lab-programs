package lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


public class student {
	String usn,name,age;
	student(){
		
	}
	student(String u,String n,String a){
		this.usn=u;
		this.name=n;
		this.age=a;
	}
	public void show() {
		System.out.println("usn="+usn+"name="+name+"age="+age);
	}
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		student st1=new student();
		Scanner sc=new Scanner(System.in);
		List<student> li=new ArrayList<student>();
		
		while(true) {
			System.out.println("1-create \n 2-display\n3-remove\n4-sort \n 5-update 6-size\n7-search 8-clear\n 9-exit \n");
			System.out.println("enter the choice");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("Enter the usn");
				String u=sc.next();
				System.out.println("Enter the name");
				String n=sc.next();
				System.out.println("Enter the age");
				String a=sc.next();
				li.add(new student(u,n,a));
			}
			else if(ch==2) {
				Iterator<student> it=li.iterator();
				while(it.hasNext()) {
					st1=it.next();
					st1.show();
				}
			}
			else if(ch==3) {
				System.out.println("Enter the usn");
				String u=sc.next();
				for(student st:li) {
					if(st.usn.equals(u)) {
						li.remove(st);
					}
				}
			}
			else if(ch==4) {
				
				//List <String> li1=new ArrayList<String>();
				//Collections.sort(li);
				

			}
			else if(ch==5) {
				System.out.println("Enter the usn");
				String u=sc.next();
				for(student st:li) {
					if(st.usn.equals(u)) {
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
				System.out.println("Enter the usn");
				String u=sc.next();
				if(li.contains(u)) {
					System.out.println("yes");
				}
//				for(student st:li) {
//					if(st.usn.equals(u)) {
//						System.out.println("present");
//						break;
//					}
//					else {
//						System.out.println("not present");
//						break;
//					}
//				}
			}
			else if(ch==8) {
				li.clear();
			}
			else if(ch==9) {
				System.out.println("exiting...");
				break;
			}
			else {
				System.out.println("Invalid");
			}
		}
	}

}
