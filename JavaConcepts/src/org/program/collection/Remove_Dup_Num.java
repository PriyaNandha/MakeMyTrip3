package org.program.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Dup_Num {
	
	
	public static void main(String[] args) {
		
		int [] num = new int[10];
		num[0] = 20;
		num[1] = 50;
		num[2] = 40;
		num[3] = 20;
		num[4] = 10;
		num[5] = 50;
		num[6] = 60;
		num[7] = 80;
		num[8] = 50;
		num[9] = 40;
		
		Set<Integer> s = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			s.add(num[i]);
		}
		for (Integer num1 : s) {
			System.out.println(num1);
		}
	}

}
