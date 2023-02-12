package Java_28_4;

public class Z {

	Z()
	{
		System.out.println("Constructor");
	}
	
	void m1()
	{
		System.out.println("Hello");
	}
	
	static {
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
		Z z=new Z();
		z.m1();
	}
}
