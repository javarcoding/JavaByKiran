package java_26_5;

import java.util.ArrayList;
import java.util.Collections;

public class B {

public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(2);
		al.add(22);
		al.add(18);
		al.add(90);
		al.add(20);
		al.add(18);
		
		Collections.sort(al);
		
		//Collections.shuffle(al);
		
		System.out.println(al);
		
		System.out.println(Collections.max(al));
		
		System.out.println(Collections.min(al));
	}
}
