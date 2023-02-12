package Java_03_5;

public class R extends Object{

	R()
	{
		super();
	}
	void m1()
	{
		System.out.println(getClass().getName() + "@" + Integer.toHexString(hashCode()));
	}
	
	public static void main(String[] args) {
		
		R r=new R();
		System.out.println(r);
		System.out.println(r.toString());
		System.out.println(r.getClass().getName());
		r.m1();
	}
}
