package org.emp;

import java.util.Scanner;

public class Factorial {

	public void factorial() {

		int a, fact =1;
		
		System.out.println("Enter the number to do factorial");
		Scanner s =new Scanner(System.in);
		a=s.nextInt();
		
		for (int i = 1; i <= a; i++) {
			
			
			fact= fact*i;
			
			
			
		}
		
		System.out.println("factorial of given number is  " + fact);
	
	}
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.factorial();
	}

}
