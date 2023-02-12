package Java_27_4;

//Anti-virus subscription
public class C {

	C()
	{
		System.out.println("Free for 1 month");
	}
	
	C(String key)
	{
		System.out.println("Activate for 3 months");
	}
	public static void main(String[] args) {
		C c=new C();
	  //C c=new C("anbbsakfkdhho2");  for parameterize constructors
	}

}
