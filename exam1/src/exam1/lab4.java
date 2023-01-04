package exam1;
import java.util.*;
import pack1.*;
public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lab4 l=new lab4();
		circle cr=new circle();
		square s=new square();
		triangle tr=new triangle();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1-circle\n 2-square \n 3-triangle\n4-exit");
			int ch=sc.nextInt();
			if(ch==1) {
				cr.cir(10.1);
			}
			else if(ch==2) {
				s.sq(5.1);
			}
			else if(ch==3) {
				tr.t1(4.1,3.1);
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
