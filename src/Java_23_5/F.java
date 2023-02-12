package Java_23_5;

import java.util.Iterator;

public class F {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		A a=new A();
		Thread t=new Thread(a);
		t.start();
		
		for (int i=21; i<30; i++) {
			Thread.sleep(100);
			System.out.println(i);
		}
	}
}
