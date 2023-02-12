package Java_25_5;

import java.util.Iterator;

public class A {

	public static void main(String[] args) 
	{
		int a[] = new int[3];
		a[0] = 20;
		a[1] = 60;
		a[2] = 12;
		
		System.out.println(a[1]);
		
		for (int i =0; i< a.length; i++) {
			System.out.println(a[i]);
			
		}
	}	
}
