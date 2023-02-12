package Java_23_5;

public class Trigger3 {

	public static void main(String[] args) throws InterruptedException {
		
		Sum s=new Sum();
		s.start();
		s.join();
		Avg a=new Avg();
		a.start();
	}
}
