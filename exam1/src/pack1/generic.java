package pack1;

import java.util.ArrayList;
import java.util.List;

// class generic {
//	Object obj;
//   generic(Object obj){
//	   this.obj=obj;
//   }
//   Object getObject() {
//	   return this.obj;
//   }
//   void show() {
//	   System.out.println("data="+this.getClass().getName());
//   }
//   public static void main(String[] args) {
//	   generic g=new generic(75);
//	   int v=(Integer)g.getObject();
//	   System.out.println(v);
//	   g.show();
//   }
//}
class Student1{

	int rno;
	Student1(int rno){
		this.rno=rno;
		System.out.println(rno);
	}
	public void show1() {
		System.out.println(rno);
	}
}
class generic<T> {
	T obj;
	generic(T obj){
		
		this.obj=obj;
	}
	T getObject() {
		return this.obj;
	}
	void show() {
		System.out.println("type of element is="+obj.getClass().getName());
	}
	public static void main(String[] args) {
		Student1 st1=new Student1(100);
		//generic<Student1> o1=new generic<Student1>(new Student1(1075));
		generic<Student1> o1=new generic<Student1>(st1);
		List<String> list=new ArrayList<String>();
		list.add("add1");
		generic<List<String>> g1=new generic<List<String>>(list);
		List<String> li=g1.getObject();
		System.out.println(li);
		o1.show();
		
		
	
	}
}
