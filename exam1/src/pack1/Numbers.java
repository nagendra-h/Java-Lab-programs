package pack1;

public class Numbers<T extends Number> {
	private T n;
	public Numbers(T n) {
		this.n=n;
	}
	public void set1(T t) {
		this.n=t;
		
	}
	public T get() {
		return n;
	}
	public <U extends String> void ins(U u) {
		System.out.println("class="+n.getClass().getName());
		System.out.println("methos="+u.getClass().getName());
	}
	public boolean isEven() {
		return n.intValue()%2==0;
	}
	public void display(T obj) {
		System.out.println(obj.getClass());
	}
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers<Integer> i1=new Numbers<Integer>(22);
		i1.set1(new Integer
				(33));
		System.out.println(i1.get());
		i1.ins("Hello RVCE");
		System.out.println("done--------------");
		
		
//		i1.display((float)23.1);
//		if(i1.isEven()) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("not");
//		}
	}

}
