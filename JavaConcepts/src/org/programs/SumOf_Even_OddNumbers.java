package org.programs;

public class SumOf_Even_OddNumbers {
	
	public static void main(String[] args) {
		
		int sum=0, sum1=0;
		for (int i = 0; i <=10; i++) {
			
			if (i%2 == 0) {
				
				sum+=i;
				
				
			} else {
				
				sum1+=i;
				

			}
		}
		System.out.println("sum of even numbers  " + sum);
		System.out.println("sum of odd numbers  " + sum1);
	}

}
