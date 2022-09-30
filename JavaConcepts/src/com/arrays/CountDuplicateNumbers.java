package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class CountDuplicateNumbers {
	
	static int count=0;
	
	public static void duplicate_Numbers() {
		
		int a[]= {1,2,3,1,2,3};
		int n=3;
		
		List<Integer> num = new ArrayList<Integer>();

		System.out.println(num);
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j <=i; j++) {
				
				if (a[i]==a[j]) {
					
					count ++;
					
				}
			}
			
		}
		
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		duplicate_Numbers();
	
	}
}
