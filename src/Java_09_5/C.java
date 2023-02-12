package Java_09_5;

public class C {

	private int add(int a, int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	
	void avg()
	{
		int ans=this.add(20, 30);
		System.out.println(ans/2);
	}
}
