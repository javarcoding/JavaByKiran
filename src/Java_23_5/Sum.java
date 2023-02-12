package Java_23_5;

import java.util.Iterator;

public class Sum extends Thread{

	static int sum =0;
	@Override
	public void run() 
	{

		for (int i=0; i<10; i++) 
		{
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sum = sum+i;
		}
		System.out.println("Total Sum = "+sum);
	}
}
