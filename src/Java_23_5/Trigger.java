package Java_23_5;

public class Trigger {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i=1; i<=10;i++) 
		{
			System.out.println(i);
		
		}
		
		A a=new A();
		a.start();
		
		for (int i=21; i<=30;i++) 
		{
			Thread.sleep(100);
			System.out.println(i);
		
		}
	}
}
