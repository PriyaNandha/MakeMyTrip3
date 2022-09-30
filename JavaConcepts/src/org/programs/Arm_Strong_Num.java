package org.programs;

public class Arm_Strong_Num {
	
	public static void main(String[] args) {
		
		int a=153, sum = 0, rem=0, temp=a;
		
		while (a>0) {
			
			rem = a%10;
			sum = sum + (rem*rem*rem);
			a=a/10;
			
		}
		if (temp==sum) {
			
			System.out.println("Armstrong number");
			
		} else {
			System.out.println("it is not a Armstrong number");		
		}
		
	}

}
