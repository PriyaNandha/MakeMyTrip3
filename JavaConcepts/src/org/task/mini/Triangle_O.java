package org.task.mini;

public class Triangle_O {
	
	
	public static void main(String[] args) {
		
		int a=10;
		
		for (int i = 3; i>=1; i--) {
			for (int j = 1; j <=i; j++) {
				
				System.out.print(a + " ");
			}
			a=a-2;
			System.out.println();
		}
		
		
	}

}
