package Java_02_5;

public class Z {

	void m1(int z)
	{
		System.out.println("m1="+z);
	}
	
	 void m2(int a, int b)
	{
		this.m1(b);
		int c=a+b;
		System.out.println("m2="+c);
	}
	public static void main(String[] args) {
		Z z=new Z();
		z.m2(20,40);

	}

}
