package Java_23_5;

import java.util.Iterator;

public class A extends Thread
{
	@Override
	public void run() {
		
		for (int i=11; i<=20;i++) 
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		
		}
	}
}
