package Java_03_5;

public class Test1 extends H {

	int a=50;
	
	void m1()
	{
		int a=60;
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		G g=new G();
		System.out.println(g.a);
		F f=new F();
		System.out.println(f.a);
		E e=new E();
		System.out.println(e.a);
			
	}
	
	public static void main(String[] args) {
		
		Test1 t=new Test1();
		t.m1();
	}

}
