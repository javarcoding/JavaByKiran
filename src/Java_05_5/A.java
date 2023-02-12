package Java_05_5;

public class A {

	String m1() {
		System.out.println(111);
		return "jbk";
	}
	int m1(int a) {
		System.out.println(777);
		return 20;
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1();
	}
}
