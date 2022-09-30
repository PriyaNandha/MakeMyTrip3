package org.programs;

public class Palindrome_Number {
	
	public static void palin() {

		int a=121, temp=a, sum = 0, rem=0;
		
		while (a>0) {
			
			rem=a%10;
			sum= (sum*10) +rem;
			a=a/10;
		}
		if (temp==sum) {
			
			System.out.println("it is a palindrome");
			
		} else {
			System.out.println("it is not a palindrome");
		}
	}
	
	public static void main(String[] args) {
		
		palin();
		
}
	
}