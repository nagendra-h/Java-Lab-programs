package exam1;

import java.util.Scanner;

public class lab1 {
	public String name;
	protected String usn;
	String br;
	Double tf1,adf1,exf1,ff1,mf1;
	
	private void ins(String usn,String name,String br) {
		this.usn=usn;
		this.name=name;
		this.br=br;
	}
	public void check() {
		if(this.br.equalsIgnoreCase("be")) {
			this.mf1=3000.0;
			this.ff1=this.adf1+this.tf1+this.exf1+this.mf1;
		}
		else {
			this.mf1=1000.0;
			this.ff1=this.adf1+this.tf1+this.exf1+this.mf1;
		}
	}
	public void dis() {
		System.out.println("usn="+this.usn+"\nname="+this.name+"\nbranch="+this.br+"fees"+this.ff1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lab1 l=new lab1();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1-insert\n 2-fee \n 3-display\n");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("enter the details");
				l.usn=sc.next();
				l.name=sc.next();
				l.br=sc.next();
				l.ins(l.usn,l.name,l.br);
			}
			else if(ch==2) {
				l.tf1=30000.0;
				l.exf1=20000.0;
				l.adf1=100000.0;
				l.check();
			}
			else if(ch==3) {
				l.dis();
			}
			else if(ch==4) {
				System.out.println("exiting");
				break;
			}
			else {
				System.out.println("wrong choice");
			}
		}
		
	}

}
