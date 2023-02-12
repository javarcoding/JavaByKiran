package Java_04_5;

public class Z {

	void getResult(int marks, int secondarymark) {
		if (marks>=40 || secondarymark>10) {
			if (marks<=100) {
				System.out.println("Pass");
			}else {
				System.out.println("wrong input");
			}
		}else {
			System.out.println("Fail");
		}
		
	}
	
	public static void main(String[] args) {
		Z z=new Z();
		z.getResult(80,30);
	}
}
