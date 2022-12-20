package lab2;
import java.util.*;


public class Hash1 {

		 public static Map<String,String> m1=new HashMap<String,String>();
		public void create(String s,String c) {
			m1.put(s, c);
		}
		public void dis() {
			for(Map.Entry<String, String> m:m1.entrySet()) {
				System.out.println("State="+m.getKey()+"Capital="+m.getValue());
			}
		}
		public void search(String k) {
			if(m1.containsKey(k)) {
				System.out.println("present");
			}
			else {
				System.out.println("not present");
			}
		}
		public void update(String k,String v) {
			m1.putIfAbsent(k, v);
		}
		public void remove(String r) {
			m1.remove(r);
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hash1 h=new Hash1();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1-create \n 2-display\n3-remove\n4-search \n 5-update 6-size\n7-sort 8-clear\n 9-exit \n");
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
			if(ch==5) {
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
				TreeMap<String,String> t1=new TreeMap<>(m1);
				
			}
			else if(ch==8) {
				m1.clear();
			}
			else if(ch==9) {
				break;
			}
			else {
				System.out.println("Invalid Choice");
			}
		}

	}

}
