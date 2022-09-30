package org.programs;

public class No_Of_Givennum {
	
	public static void main(String[] args) {
		
		int a=12345, count=0;
		while (a>0) {
			
			count++;
			a/=10;
		}
		System.out.println(count);
	}

}
