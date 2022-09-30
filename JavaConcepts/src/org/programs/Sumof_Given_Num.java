package org.programs;

public class Sumof_Given_Num {
	
	public static void main(String[] args) {
		
		int a = 854, sum=0, rem;
		
		while (a>0) {
			
			rem = a%10;
			sum = sum+rem;
			a=a/10;
			
		}
		System.out.println(sum);
		
		int  j=0;
		for (int i = 1; i <= 5; i++) {
			
			j=j+i;
		}
	
		System.out.println("j = " +j);

		
	}

}
