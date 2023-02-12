package java_26_5;

import java.util.ArrayList;
import java.util.Iterator;

public class E {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.rollNo = 2;
		s1.name = "JBK";
		s1.loc = "Pune";
		
		Student s2=new Student();
		s2.rollNo = 2;
		s2.name = "JBK";
		s2.loc = "Pune";
		
		Student s3=new Student();
		s3.rollNo = 2;
		s3.name = "JBK";
		s3.loc = "Pune";
		
		Student s4=new Student();
		s4.rollNo = 2;
		s4.name = "JBK";
		s4.loc = "Pune";
		
		
		ArrayList<Student> al =new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println(al);
		
		for (Student student:al) {
			System.out.println(student);
			
		}
		
		
	}
}
