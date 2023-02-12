package java_26_5;

import java.util.ArrayList;

public class D {

	public static void main(String[] args) {
		

		ArrayList<Integer> al=new ArrayList();
		al.add(20);
		al.add(2);
		al.add(22);
		al.add(90);
		al.add(18);
		
		
		System.out.println(al);
		
		Integer li=al.get(3);
		
		System.out.println(li); //value in object
		
		int value=li.intValue();
		System.out.println(value); //value in integer
		
	}
}
