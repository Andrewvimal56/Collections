package org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		Employee e = new Employee();
		e.setId(1234);
		e.setName("vimal");
		e.setPhNo(9876543209l);
		Employee e1 = new Employee();
		e1.setId(5432);
		e1.setName("Herbert");
		e1.setPhNo(8765432987l);
		l.add(e);
		l.add(e1);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getId());
			System.out.println(l.get(i).getName());
			System.out.println(l.get(i).getPhNo());
		}
		System.out.println("Enhanced Forloop");

		for (Employee x : l) {
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getPhNo());
		}
	}

}
