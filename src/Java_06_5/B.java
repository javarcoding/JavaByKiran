package Java_06_5;

public class B extends A{
    
	@Override
	void m1()
	{
		System.out.println(555);
	}
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		System.out.println(b.toString());
		
		String  ss=new String("Kiran");
		System.out.println(ss.toString());
		
	}
}
