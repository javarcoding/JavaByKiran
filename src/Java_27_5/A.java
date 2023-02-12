package Java_27_5;

import java.util.ArrayList;
import java.util.Iterator;

public class A {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.age=20;
		e.dpName="Dev";
		e.empID=123;
		e.loc="IND";
		e.name="JBK";
		
		Employee e1=new Employee();
		e1.age=40;
		e1.dpName="Test";
		e1.empID=456;
		e1.loc="IND";
		e1.name="Kiran";
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(e);
		al.add(e1);
		System.out.println(al);
		
		
		for (Employee employee : al) {
			System.out.println(employee.getEmpID());
			System.out.println(employee.getName());
		}
	}
}
