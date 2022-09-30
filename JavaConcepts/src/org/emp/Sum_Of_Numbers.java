package org.emp;

import java.util.Scanner;

public class Sum_Of_Numbers {

	
	
	public static void sumofnum() {

		int sum =0,  rem, n;
		
		System.out.println("Enter the number ");
		Scanner s= new Scanner(System.in);
		 n=s.nextInt();  
		
		for (int i = 0; i <=20; i++) {
			
			rem = n % 10;
			sum= sum+rem;
			n = n/10;
			
			
			
		}
		System.out.println();
		System.out.println(sum);
	}
	
	public static void main (String[] args) {
		
		sumofnum();
	}

}
