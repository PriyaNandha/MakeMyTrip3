package com.packs;

import java.util.Arrays;

public class String_2 {
	
	
	private static void sub_Meth(String[] s3) {
		for (String string : s3) {
			System.out.println(string);
			
		}

	}
	
	
	public static void main(String[] args) {
		
		String s1 = "Hello-1234 learn java";
		String s2 = " Hi ";
		String s4 = "Java Program";
		
		String s3[] = s1.split(" ");
		System.out.println(Arrays.toString(s3)); //split words with ,
		
		sub_Meth(s3);
		
		System.out.println(s1.getBytes());
		System.out.println(s1.lastIndexOf("v"));
		System.out.println(s1.length());
		System.out.println(s1.replace(s1, s2));
		System.out.println(s1.replaceAll(s1, s4));
		System.out.println(s4.replaceFirst("Java", "Practise"));
		
		char[] s5 = s2.toCharArray();
		System.out.println(s5);
		
		System.out.println(s2.trim());
		
		
	
	
	}
	
	
	
	

}
