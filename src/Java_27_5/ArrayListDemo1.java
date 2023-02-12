package Java_27_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListDemo1 {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> al=new LinkedHashMap<>();  //generic
		al.put(1, "Raj");
		al.put(5, "Suraj");
		al.put(null, "Priya");
		al.put(null, "Raj");
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		for (int value : al.keySet()) {
			System.out.println(al.get(value));
			System.out.println(value +" = "+al.get(value));
		}

		Set s=al.entrySet();
		Iterator itr=s.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
			
		}
	}
}
