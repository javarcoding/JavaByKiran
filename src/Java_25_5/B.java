package Java_25_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class B {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(60);
		al.add(12);
		
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		Collections.sort(al);
		for (int i =0; i< al.size(); i++) {
			System.out.println(al.get(i));
			
		}
	}
}
