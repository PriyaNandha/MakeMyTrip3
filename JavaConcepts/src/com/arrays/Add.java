package com.arrays;

public class Add {

	
	public static void main(String[] args) {
		
		int a [][] ={ {1,2},{3,4}};
		
		int b [] [] = {{5,6},{7,8}};
		
		int sum[][] = new int [2][2];
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j] + " ");
				
				
			}
			System.out.println();
		} 
		
		
		
		
		
	}
	
	
}
