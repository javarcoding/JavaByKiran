package Java_24_5;

public class B {

	void m1(int a, int b, D d) {
		if (b!=0) {
			int c= a/b;
			System.out.println(c);
		}if (d!=null) {
			d.show();
		}
		
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.m1(50, 10, null);
	}
}
