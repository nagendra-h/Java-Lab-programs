package pack1;


class Bound<T extends A&d>{
	private T obj;
	public Bound(T obj) {
		this.obj=obj;
	}
	public void doRun() {
		this.obj.display();
		this.obj.dis();
	}
}
interface d{
	public void dis();
}
class A implements d{
	public void display() {
		System.out.println("inside the A");
	}
	public void dis() {
		System.out.println("Interface D");
	}
}
class B extends A{
	public void display() {
		System.out.println("inside the B");
	}}

class C extends A{
	public void display() {
		System.out.println("inside the C");
	}}

public class bound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bound<C> c1=new Bound<C>(new C());
		c1.doRun();
		Bound<B> b1=new Bound<B>(new B());
		b1.doRun();
		Bound<A> a1=new Bound<A>(new A());
		a1.doRun();
		//Bound<Integer> i1=new Bound<Integer>(new Integer(10));

	}

}
