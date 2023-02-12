package Java_16_5;

public class A {

	void m1()
	{
		String s="TheKiranAcademy";
		System.out.println(s);       //SCP
		
		String p=new String("Java");
		System.out.println(p);       //Heap
		System.out.println(p.intern());  //SCP
		
		String a="The";
		String b="Kiran";
		String c="Academy";
		System.out.println(a.concat(b).concat(c)); //connect
		System.out.println(a+b+c);
		
		System.out.println(s.substring(3));   //begin Index 3 
		System.out.println(s.substring(3,8)); // begin Index 3 and ending Index 8
		
		System.out.println(s.replace('K', 'S')); //replace K by S
		
		System.out.println(s.indexOf("de"));  //begin index number
		
		System.out.println(s.toLowerCase());  //print all letter in lowercase
		System.out.println(s.toUpperCase());  //print all letter in uppercase
		
		String x= "k4i2";
		String n1=x.substring(1,2);
		System.out.println(n1);
		String n2=x.substring(3,4);
		System.out.println(n2);
		System.out.println(n1+n2);
		
		//convert String to integer
		int n11=Integer.parseInt(n1);
		System.out.println(n11);
		int n22=Integer.parseInt(n2);
		System.out.println(n22);
		System.out.println(n11+n22);
		
		
	}
	
	public static void main(String[] args) {
		
		A a=new A();
		a.m1();
	}
}
