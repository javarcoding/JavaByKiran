package Java_02_5;

public class Y {

	Y()
	{
		System.out.println("I am in default Constructor");
	}
	Y(int s)
	{
		this();
		System.out.println("I am in Para constructor");
	}
	
	public static void main(String[] args) {
		Y y=new Y(20);
		
	}
	
}
