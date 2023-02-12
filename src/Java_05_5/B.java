package Java_05_5;
//get Admission
public class B {

	//D Y Patil
	void getAdmission(int marks,int fees, String name, int age)
	{
		System.out.println("Admission success....!!!");
	}
	void getAdmission(int marks,int fees, String name, int age, int adhar)
	{
		System.out.println("Admission success....!!!");
	}
	public static void main(String[] args) {
		B b=new B();
		b.getAdmission(60, 5000, "Sagar", 26);
//Compile time polymorphism //static polymorphism
	}
}
