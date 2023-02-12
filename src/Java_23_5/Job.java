package Java_23_5;

public class Job extends Thread{

	static int balance = 1000;
	
	@Override
	public void run() {
		for (int i=0; i< 5;i++) 
		{
			withdraw(150);
		
		}
	
		
	}

	private static synchronized void withdraw(int amt) {
		if (balance>150) {
			System.out.println(Thread.currentThread().getName());
			balance = balance - amt;
			System.out.println("Remaining Bal ="+balance);
		}else {
			System.out.println("Insufficient fund");
		}
		
	}
	
}
