package Java_04_5;
//voting
public class Y {

	void getAge(int age) {
		if (age>=18 && age<110) {
			System.out.println("vote done");
		}else {
			System.out.println("Not eligible for vote");
		}
		
	}
	
	public static void main(String[] args) {
		Y y=new Y();
		y.getAge(20);
	}
	
}
