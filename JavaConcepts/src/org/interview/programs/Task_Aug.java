package org.interview.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_Aug {
	
	public static void sub_Method() {
		
		int [] a = {1,2,4};
		
		int b= 5,temp,c,d;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0+1; j < a.length; j++) {
				
//			 temp = a[i] + a[j];
//			 c=a[i]; d=a[j];
			 
			if (a[i] + a[j]==b) {
				
				System.out.println("["+ i + " " + j+"]");
				
			}
			
		}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		sub_Method();
		
		
	}

}
