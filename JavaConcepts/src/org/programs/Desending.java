package org.programs;

public class Desending {
	
	public static void main(String[] args) {
		int [] num = new int[5];
		int temp;
		
		num[0] = 500;
		num[1] = 300;
		num[2] = 400;
		num[3] = 200;
		num[4] = 100;
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = i+1; j < num.length; j++) {
				
				if (num[i]<num[j]) {
					
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				
			}
			
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		
		System.out.println();
		System.out.println("Maximum number is : " + num[0]);
		System.out.println("Second Maximum number is : " + num[1]);
	}

	}


