package Java_06_5;

public class Hdfc extends Rbi 
{
	@Override
	void atmWithdraw()
	{
		System.out.println(35000);
	}
	
	void m2()
	{
		System.out.println(777);
	}
	@Override
	void m1()
	{
		System.out.println(999);
	}
	public static void main(String[] args) {
		
		Rbi rr=new Hdfc();
		rr.atmWithdraw();
//Run time polymorphism		
	}
}
