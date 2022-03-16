package org.collections;

import java.util.*;

public class Company2 {
	public static void main(String[] args) {
		Set<Employee> s = new LinkedHashSet<>();
		Employee e = new Employee();
		e.setId(1234);
		e.setName("vimal");
		e.setPhNo(9876543209l);
		Employee e1 = new Employee();
		e1.setId(5432);
		e1.setName("Herbert");
		e1.setPhNo(8765432987l);
		Employee e2 = new Employee();
		e2.setId(5432);
		e2.setName("Herbert");
		e2.setPhNo(8765432987l);
		Employee e3 = new Employee();
		e3.setId(1234);
		e3.setName("Vimal");
		e3.setPhNo(9876543210l);
		s.add(e);
		s.add(e1);
		s.add(e2);
		s.add(e3);

		for (Employee emp : s) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getPhNo());
		}
		
	}
}
