package Java_27_4;

public class B {

	B(String name)
	{
		System.out.println("Hi "+name);
	}
	
	void msg()
	{
		System.out.println("This offer is only for you");
	}
	
	public static void main(String[] args) {
		String custName="Sagar";
		B b=new B(custName);
		b.msg();
	}
}
