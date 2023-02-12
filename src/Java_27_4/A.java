package Java_27_4;

public class A {

	A(int x)
	{
		System.out.println("I am in constructor");
		System.out.println(x);
	}
	void show()
	{
		System.out.println("I am in show");
	}
	
	public static void main(String[] args) {
		A a =new A(10);
		a.show(); 	
	}
	
}
