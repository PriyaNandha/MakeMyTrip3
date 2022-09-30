package org.programs;

public class Prime_Number {

	 static int count, count2;
	public static void main(String[] args) {
		
		for (int i = 2; i <100; i++) {
			
			boolean flag = true;
			for (int j = 2; j <i; j++) {
				
				if (i%j==0) {
					
					flag = false;
				}
				
			}
			if (flag==true) {
				System.out.println(i + " is a prime number");
				count++;
			}
			else {
				System.out.println(i + " not a prime number");
				count2++;
			}
		}
		
		System.out.println("total num of prime number" + count);
		System.out.println("total num of non prime number" + count2);
		
	}
	
	
	
}
