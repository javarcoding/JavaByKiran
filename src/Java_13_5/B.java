package Java_13_5;

public class B {

	public static void main(String[] args) {
		
		B b=new B();
		System.out.println(b);
		System.gc();
		
		B b1=new B();
		System.out.println(b1);
		
		System.out.println(b.equals(b1));
	}
}
