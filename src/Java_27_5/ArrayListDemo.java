package Java_27_5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		
		ArrayList<String> al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println(al);
		
		System.out.println(al.remove(1));
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		
		for (String value : al) {
			System.out.println(value);
		}
		
		Iterator itr=al.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
			
		}
		
		
		
	}
}
