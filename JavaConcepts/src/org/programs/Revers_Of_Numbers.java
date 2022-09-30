package org.programs;

public class Revers_Of_Numbers {
	
	public static void rev() {
		int a=123, temp=a, sum = 0, rem=0;
		
		while (a>0) {
			
			rem=a%10;
			sum= (sum*10) +rem;
			a=a/10;
		}
		System.out.println(sum);
	}
	
	
	
	
	public static void main(String[] args) {
		
		rev();

}
}
