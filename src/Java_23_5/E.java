package Java_23_5;

import java.util.Iterator;

public class E implements Runnable{

	@Override
	public void run() {
		
		for (int i=11; i<20; i++) 
		{
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i);
			
		}
	}
}
