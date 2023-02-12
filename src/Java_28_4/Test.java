package Java_28_4;

public class Test {

	public static void main(String[] args) {
		
		X x=new X();
		System.out.println(x.a);     //20
		System.out.println(x.b);     //30
		
		x.a++;
		x.b++;
		System.out.println(x.a);     //21
		System.out.println(x.b);     //31
		
		X x1=new X();
		x1.a++;
		x1.b++;
		System.out.println(x1.a);    //21
		System.out.println(x1.b);    //32
	}

}
