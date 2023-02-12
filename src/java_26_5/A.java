package java_26_5;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(2);
		al.add(22);
		al.add(18);
		al.add(90);
		al.add(20);
		al.add(18);
		
		System.out.println(al);
		
		System.out.println(al.get(5));
		
		al.remove(4);
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.isEmpty());
	}
}
