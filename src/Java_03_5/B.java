package Java_03_5;

public class B extends A {

	void show()
	{
		System.out.println(111);
	}
	void m1()
	{
		System.out.println("I am in m1");
		this.show();
		super.show();
	}
	public static void main(String[] args) {
		B b=new B();
		b.m1();
	}
}
