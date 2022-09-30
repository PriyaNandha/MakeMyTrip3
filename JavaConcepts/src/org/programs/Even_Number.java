package org.programs;

public class Even_Number {
	
	public static void main(String[] args) {
		
		int  count=0, count1=0;
		
		for (int i = 0; i < 20; i++) {
			
		
		
		if (i%2 == 0) {
			
//			System.out.println(i + " is even number");
			count ++;
			
		} else {
			
//			System.out.println(i + " is a odd number");
			count1++;
		}
		
	}
		System.out.println("total even numbers " + count);
		System.out.println("total odd numbers " + count1);
	
	}

}
