package Java_13_5;

public class A extends Object
{
	
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(a.getClass().getName());
		System.out.println(a.getClass().getName()+"@"+Integer.toHexString(a.hashCode()));
		System.out.println(a.hashCode());
		System.out.println(Integer.toHexString(a.hashCode()));
		
	}
}
