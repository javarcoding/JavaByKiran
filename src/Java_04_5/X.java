package Java_04_5;

public class X {

	void getAge(int age)
	{
		if (age>0) {
			System.out.println("My Age ="+age);
		}
		else {
			System.out.println("Negative age is not allowed");
		}
	}
	
	public static void main(String[] args) {
		X x=new X();
		x.getAge(28);
	}
}
