package org.scans;

import java.util.Scanner;

public class Task {

	public void task() {

	System.out.println("Enter a number");
	Scanner a = new Scanner(System.in);
	int b = a.nextInt();
	System.out.println("Entered number is " + b);
	System.out.println();
	
	System.out.println("Enter a String");
	Scanner s = new Scanner(System.in);
	String c = s.next();
	System.out.println("Entered string is " + c);
	System.out.println();

	System.out.println("Enter a String");
	Scanner d = new Scanner(System.in);
	String e = d.nextLine();
	System.out.println("Entered number is " + e);
	
	}

	public static void main(String[] args) {
		Task t = new Task();
		t.task();
		
	}
}
