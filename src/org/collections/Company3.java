package org.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Company3 {
	public static void main(String[] args) {
		Map<Integer,Employee> m = new HashMap<>();
		Employee e = new Employee();
		e.setId(1234);
		e.setName("vimal");
		e.setPhNo(9876543209l);
		Employee e1 = new Employee();
		e1.setId(5432);
		e1.setName("Herbert");
		e1.setPhNo(8765432987l);
		m.put(500, e);
		m.put(1000, e);
		int size = m.size();
		System.out.println(size);
		Set<Entry<Integer,Employee>> entrySet = m.entrySet();
		for (Entry<Integer, Employee> x : entrySet) {
			System.out.println(x.getKey()+"Employee Info");
			System.out.println(x.getValue().getId());
			System.out.println(x.getValue().getName());
			System.out.println(x.getValue().getPhNo());
			
			
			
		}
	}
	

}
