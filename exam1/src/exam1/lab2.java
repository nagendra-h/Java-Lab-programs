package exam1;

import java.util.Scanner;

public class lab2 {
	String usn,name,emailid,clg_n,addr_n;
	static String clg,addr;
	Double tf1,adf1,exf1,ff1;

	static {
		clg="rvce";
		addr="bangalore";
	}
	lab2(){
		System.out.println("lab2");
	}
	lab2(String usn,String name,String clg_n,String addr_n,String emailid){
		this.usn=usn;
		this.name=name;
		this.clg_n=clg_n;
		this.addr_n=addr_n;
		this.emailid=emailid;
	}
	public void dis() {
		System.out.println("usn="+this.usn+"\nname="+this.name+"\nclg="+this.clg_n+ "\naddress"+this.addr_n+"\nemailid"+this.emailid+"\nfees"+this.ff1);

	}
	public void dis(int n) {
		if(n==1) {
			System.out.println("college="+clg +"address="+addr);
		}
		else if(n==2) {
			System.out.println("usn="+this.usn+"\nname="+this.name+"\nclg="+this.clg_n+ "\naddress"+this.addr_n+"\nfees"+this.ff1);
		}
	}
	public void fees() {
		this.tf1=30000.0;
		this.exf1=20000.0;
		this.adf1=100000.0;
		this.ff1=this.adf1+this.tf1+this.exf1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lab2 l=new lab2();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1-insert\n 2-fee \n 3-display\n 4-display with number\n5-exit");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("enter the details");
				l.usn=sc.next();
				l.name=sc.next();
				l.clg_n=sc.next();
				l.addr_n=sc.next();
				System.out.println("emailid neede");
				String sd=sc.next();
				if(sd.equals("yes")) {
					System.out.println("enter");
					l.emailid=sc.next();
					l=new lab2(l.usn,l.name,l.clg_n,l.addr_n,l.emailid);
				}
			}
			else if(ch==2) {
				
				l.fees();
			}
			else if(ch==3) {
				l.dis();
			}
			else if(ch==4) {
				System.out.println("number");
				int n=sc.nextInt();
				l.dis(n);
			}
			else if(ch==5) {
				System.out.println("exiting");
				break;
			}
			else {
				System.out.println("wrong choice");
			}
		}
		
	}

}
