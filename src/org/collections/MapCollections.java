package org.collections;

import java.util.*;
import java.util.Map.Entry;

public class MapCollections {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(10, "Thamizh");
		m.put(23, " Venki");
		m.put(30, "Abilash");
		m.put(10, "Selvan");
		m.put(20, "Vimal");
		m.put(40, "Vimal");
		m.put(10, "Karthick");
		
		System.out.println(m);
//		// To get Values only from Map
//		Collection<String> values = m.values();
//		//System.out.println(values);
//		for (String x : values) {
//			System.out.println(x);
//			
//		}
//		// TO get Keys only from Map
//		Set<Integer> keySet = m.keySet();
//		//System.out.println(keySet);
//		for (Integer integer : keySet) {
//			System.out.println(integer);
//			
//		}
//		Set<Entry<Integer, String>> entrySet = m.entrySet();
//		for (Entry<Integer, String> entry : entrySet) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//			
	//	}
		Iterator<Entry<Integer, String>> itr = m.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> next = itr.next();
			System.out.println(next.getKey());
			System.out.println(next.getValue());
		}
			
		
					
	
		
	
			
		
		
			
		}
		
		
		
		

//		// To find length
//		int a = m.size();
//		System.out.println(a);
//
//		// To get Particuler value
//		String b = m.get(10);
//		System.out.println(b);
//
//		// To check whether the key is present or not
//		boolean c = m.containsKey(30);
//		System.out.println(c);
//
//		// To check whether the value is present or not
//		boolean d = m.containsValue("Vimal");
//		System.out.println(d);
//
//		// To check key only
//		Set<Integer> e = m.keySet();
//		System.out.println(e);
//		
//		// To print value only
//		Collection<String> f = m.values();
//		System.out.println(f);
//		
//		// Entry set method   We have to use entry set before forlooping beacuse it contains both key and value
//		Set<Entry<Integer, String>> gh = m.entrySet();
//		for(Entry<Integer,String> x:gh) {
//			System.out.println(x.getKey());
//			System.out.println(x.getValue() );
//			
//		}
	}


