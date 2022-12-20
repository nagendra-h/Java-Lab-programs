package lab2;
import java.util.*;


public class tree {

	static TreeMap<String,String> m1=new TreeMap<>();
	private void create(String s,String c) {
		m1.put(s, c);
	}
	private void dis() {
		for(Map.Entry<String, String> m:m1.entrySet()) {
			System.out.println("State="+m.getKey()+"Capital="+m.getValue());
		}
	}
	private void search(String k) {
		if(m1.containsKey(k)) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
	}
	private void update(String k,String v) {
		m1.putIfAbsent(k, v);
	}
	private void remove(String r) {
		m1.remove(r);
	}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	tree h=new tree();
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("1-create \n 2-display\n3-remove\n4-search \n 5-update \n 6-size\n7-replace \n 8-clear\n 9-exit \n 10-desecending \n 11-head \n 12- tail \n 13-pollFirst \n 14-pollLast \n 15-SubString \n");
		System.out.println("enter the choice");
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.println("Enter the State");
			String u=sc.next();
			System.out.println("Enter the Capital");
			String n=sc.next();
			h.create(u, n);
			
		}
		else if(ch==2) {
			h.dis();
		}
		else if(ch==3) {
			System.out.println("Enter the State");
			String u=sc.next();
			h.remove(u);
		}
		else if(ch==4) {
			System.out.println("Enter the State");
			String u=sc.next();
			h.search(u);
		}
		else if(ch==5) {
			System.out.println("Enter the State");
			String u=sc.next();
			System.out.println("Enter the Capital");
			String n=sc.next();
			h.update(u,n);
			
		}
		else if(ch==6) {
			System.out.println(m1.size());
		}
		else if(ch==7) {
			System.out.println("enter the State");
			String s=sc.next();
			System.out.println("enter the next State");
			String s1=sc.next();
			m1.replace(s, s1);
			
			
		}
		else if(ch==8) {
			m1.clear();
		}
		else if(ch==9) {
			break;
		}
		else if(ch==10) {
			System.out.println("In the desecending order"+m1.descendingKeySet());
		}
		else if(ch==11) {
			System.out.println("Enter the State");
			String u=sc.next();
			System.out.println("Head Map"+m1.headMap(u));
		}
		else if(ch==12) {
			System.out.println("Enter the State");
			String u=sc.next();
			System.out.println("Tail Map"+m1.tailMap(u));
		}
		
		else if(ch==13) {
			m1.pollFirstEntry();
			Iterator<String> it=m1.keySet().iterator();
			while(it.hasNext()) {
				String st1=it.next();
				System.out.println("State="+st1+"Capital="+m1.get(st1));
			}
		}
		else if(ch==14) {
			m1.pollLastEntry();
			Iterator<String> it=m1.keySet().iterator();
			while(it.hasNext()) {
				String st1=it.next();
				System.out.println("State="+st1+"Capital="+m1.get(st1));
			}		
			}
		else if(ch==15) {
			System.out.println("Enter the first State");
			String u=sc.next();
			System.out.println("Enter the Last State");
			String u1=sc.next();
			System.out.println("Tail Map"+m1.subMap(u, u1));
		}
	    else {
			System.out.println("Invalid Choice");
		}
	}

}

}
