package exam1;

import java.util.Scanner;

class person{
	public String usn,name;

	person(String usn,String name){
		this.usn=usn;
		this.name=name;
	}
	public void dis(Object a) {
		if(a instanceof staff st) {
			System.out.println("usn="+this.usn+"\nname="+this.name+"\nsal="+st.sal);
		}
		else if(a instanceof stud s1){
			System.out.println("usn="+this.usn+"\nname="+this.name+"\nfees="+s1.ff1);

		}
	}
}

interface staff_op {
	double sal(Double sa);
}
class staff extends person implements staff_op{
	public Double sal;
	staff(String usn,String name,Double sal){
		super(usn,name);
		this.sal=sal;
	}
	@Override
	public double sal(Double sa) {
		// TODO Auto-generated method stub
		this.sal +=1000.0;
		return this.sal;
	}
	
}

interface stud_op {
	double fee(Double sa);
}
class stud extends person implements stud_op{
	Double ff1;
	stud(String usn,String name,Double sal){
		super(usn,name);
		this.ff1=sal;
	}
	@Override
	public double fee(Double sa) {
		// TODO Auto-generated method stub
		this.ff1 +=1000.0;
		return this.ff1;
	}
	
}



public class lab3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lab3 l=new lab3();
		staff st=null;
		stud s1=null;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1-staff\n 2-student \n 3-exit\n");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("enter the staff details");
				String usn=sc.next();
				String name=sc.next();
				Double sal=sc.nextDouble();
				st=new staff(usn,name,sal);
				st.sal(sal);
				st.dis(st);
			}
			else if(ch==2) {
				System.out.println("enter the student details");
				String usn=sc.next();
				String name=sc.next();
				Double ff1=sc.nextDouble();
				s1=new stud(usn,name,ff1);
				s1.fee(ff1);
				s1.dis(s1);
			}
			else if(ch==3) {
				System.out.println("exiting");
				break;
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
