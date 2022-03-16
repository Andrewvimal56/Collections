package org.collections;

import java.util.*;

public class ListCollection {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		List<String> m = new ArrayList<>();
		l.add("My");
		l.add("Name");
		l.add("is");
		l.add("Vimal");
		m.add("My");
		m.add("Friend ");
		m.add("Name");
		m.add("is");
		m.add("Herbert");
		List<String> n = new ArrayList<>();

		System.out.println(l);
		System.out.println(m);

		// To get particular Value ( Object is the super class of all java class)
		String a = l.get(2);
		String b = m.get(4);
		System.out.println(a);
		System.out.println(b);

		// List in Forloop
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

		for (String x : l) {
			System.out.println(x);
		}
		for (String y : m) {
			System.out.println(y);
		}
		// To find length
		int c = l.size();
		System.out.println(c);

		// To check whether the list is empty
		boolean d = m.isEmpty();
		System.out.println(d);

		// To check whether the value is present or not
		boolean e = l.contains("Vimal");
		System.out.println(e);

		// To find index position
		int f = m.indexOf("Herbert");
		System.out.println(f);

		// To find last index position
		int g = l.lastIndexOf("is");
		System.out.println(g);

		// To remove the value
		// l.remove(0);
		// System.out.println(l);

		// To add particular value inside the specified position
		m.add(4, "Sam");
		System.out.println(m);

		// To copy value from one list to another we use all ( If the value is already
		// there it will react according to the value if there is no value the current
		// value will react)

		m.addAll(l);
		m.add(2, "is");
		m.add(4, "Vimal");
		System.out.println(m);

		n.addAll(l);
		n.add(3, "Rex");
		n.add(5, "Prakash");
		n.add(" A ");
		System.out.println(n);

		// To compare two list and print common value

		m.retainAll(l);
		System.out.println(m);

		// To compare two list and remove the common value
		l.removeAll(m);
		System.out.println(l);

	}
}
