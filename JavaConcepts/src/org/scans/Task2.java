package org.scans;

import java.util.Scanner;

public class Task2 {

	public void task2() {

		System.out.println("Enter a String");
		Scanner d = new Scanner(System.in);
		String e = d.nextLine();
		System.out.println("Entered number is " + e);
		System.out.println();
		
		System.out.println("Enter a String");
		Scanner s = new Scanner(System.in);
		String c = s.next();
		System.out.println("Entered string is " + c);
		System.out.println(); 

		System.out.println("Enter a number");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		System.out.println("Entered number is " + b);
		
		
		
		
		}

		public static void main(String[] args) {
			Task2 t = new Task2();
			t.task2();
			
		}

}
