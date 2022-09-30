package org.emp;

public class Swaps {

	public void swaps() {

		String  a = "Java", b= "Program";
		String temp;
		
		System.out.println("before swaping ");
		System.out.println("a :  "+ a);
		System.out.println( "b  : " + b);
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println();
		System.out.println("after swaping " );
		System.out.println("a :  "+ a);
		System.out.println( "b : " + b);
	
	
	}
	public static void main(String[] args) {
		Swaps a = new Swaps();
		a.swaps();
	}

}
