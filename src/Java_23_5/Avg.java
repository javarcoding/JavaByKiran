package Java_23_5;

public class Avg extends Thread
{
	@Override
	public void run() {
		Sum ss=new Sum();
		int totalsum=ss.sum;
		int avg = totalsum/10;
		System.out.println("Average ="+avg);
	}
}
