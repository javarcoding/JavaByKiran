package Java_24_5;

public class S {

	void m1()
	{
		try {
			throw new SudentNotRespondingException();
		} catch (SudentNotRespondingException e) {
			System.out.println("Kitana bhi bolo, Ham baat nahi");
		}
		
	}
	public static void main(String[] args) {
		S s=new S();
		s.m1();
	}
}
