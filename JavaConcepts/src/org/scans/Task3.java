package org.scans;

import java.util.Scanner;

public class Task3 {

	public int nextint() {
		System.out.println("Whats your age?");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();

		System.out.println("age is " +age);

		return age;
	}

	public String next() {
		System.out.println("What program your studying");
		Scanner s = new Scanner(System.in);

		String courses = s.next();
		System.out.println("Courses is " + courses);

		return courses;
	}

	public String nextline() {
		System.out.println("what you studied before? ");
		Scanner s = new Scanner(System.in);

		// String courses=s.nextLine();
		String worked = s.nextLine();
		// worked=worked+s.nextLine();
		System.out.println("worrked in"+ worked);
		return worked;
	}

	public static void main(String[] args) {
		Task3 t = new Task3();
		t.next();
		t.nextint();
		t.nextline();
	}

}

/*
 * public void task3() {
 * 
 * System.out.println("Enter a String"); Scanner s = new Scanner(System.in);
 * String c = s.next(); System.out.println("Entered string is " + c);
 * System.out.println();
 * 
 * System.out.println("Enter a String"); Scanner d = new Scanner(System.in);
 * String e = s.nextLine(); System.out.println("Entered number is " + e);
 * System.out.println();
 * 
 * System.out.println("Enter a number"); Scanner a = new Scanner(System.in); int
 * b = s.nextInt(); System.out.println("Entered number is " + b);
 * 
 * 
 * 
 * 
 * }
 * 
 * public static void main(String[] args) { Task3 t = new Task3(); t.task3();
 * 
 * }
 */
