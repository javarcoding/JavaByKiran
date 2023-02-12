package Java_28_4;

//Shopping
public class Bank {

	static int balance=1000;
	
	void withdrow(int amt)
	{
		balance=balance-amt;
		
		System.out.println("Reaming Balance:"+balance);
	}
}
