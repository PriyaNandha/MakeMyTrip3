package com.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practise {

	public static <T> void main(String[] args) {

		List<Object> a = new ArrayList<>();
		
		a.add(10);
		a.add(20);
		a.add("Hello");
		a.add("World");
		
		
//		System.out.println(a.get(0));
//		a.set(0, "Hi");
//		System.out.println(a);
		
		List<Object> b = new ArrayList<>();
		b.add("Java");
		b.add("Programming");
		
//		a.addAll(b);
//		System.out.println(a);
//		System.out.println(b);
//		
//		a.addAll(0, b);
//		System.out.println(a);
		
		List<Object> c = new ArrayList<>();
		c.add(10);
		c.add(20);
		c.add("Hello");
		c.add("World");
//		System.out.println(c);
//		c.clear();
//		System.out.println(c);
		
		boolean d = a.contains(c);		
		System.out.println(d);
		
		boolean e =a.containsAll(c);
		System.out.println(e);
		
		boolean f = a.equals(c);
		System.out.println(f);
		a.indexOf(0);
		
	}


}
