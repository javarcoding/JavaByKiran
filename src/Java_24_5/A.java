package Java_24_5;

public class A {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3/0);
		}
		catch (NullPointerException e) {
			System.out.println("Zero not allowed");
		}
		System.out.println(4);
		System.out.println(5);
		
	}
}
