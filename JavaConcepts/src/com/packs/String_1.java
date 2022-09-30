package com.packs;
public class String_1 {

	public static void main(String[] args) {

		String s = "Hello";
		String s1 = "World";
		String s3 = "hello";

		System.out.println(s.concat(s1)); // concate two string
		System.out.println(s + s3); // concate two string

		boolean s2 = s.equals(s1); // compares two string return type is boolean
		System.out.println(s2);

		System.out.println(s.equalsIgnoreCase(s3));

		System.out.println(s == s1); // compares two string return type is string boolean

		System.out.println(s.compareTo(s1)); // compares two string with ASCII return type is int

		System.out.println(s.compareToIgnoreCase(s3));// compares two string with ASCII return type is int

		StringBuilder s4 = new StringBuilder("Java");
		StringBuilder s5 = new StringBuilder("Program");

		StringBuilder s6 = s4.append(s5);
		System.out.println(s6);

		String s7 = new String("Hello");
		String s8 = new String("World");
		String s9 = String.format("%s%s", s7, s8); // %s is format specifier to concat string
		System.out.println(s9.toString()); // (s9)

		String s10 = String.join(" ", s7, s8); // String.join() available from java 8
		System.out.println(s10.toString());

		System.out.println(s.substring(1, 4)); // (lastindex-1)

		System.out.println(s.startsWith("H"));

		System.out.println(s.startsWith(s10));

		System.out.println(s.contains(s1));

		System.out.println(s.codePointAt(0)); // return Ascii value

		System.out.println(s.codePointBefore(1)); // return Ascii value

		System.out.println(s.contentEquals(s1));

		System.out.println(s.contentEquals(s1));
		System.out.println(s1.describeConstable());

		System.out.println(s.endsWith(s10));

	}

}
