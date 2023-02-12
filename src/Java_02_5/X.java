package Java_02_5;

public class X {

	int p=90;
	
	void m1()
	{
		int p=70;
		System.out.println("I am in m1");
		this.m2();
		System.out.println(p);
	}
	
	void m2()
	{
		System.out.println("I am in m2");
	}
	
	public static void main(String[] args) {
		
		X x=new X();
		x.m1();
	}
}
