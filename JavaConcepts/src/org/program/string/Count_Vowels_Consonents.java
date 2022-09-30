package org.program.string;

public class Count_Vowels_Consonents {
	
	public static void main(String[] args) {
		
		String s = "Hi this is java program";
		
		String [] ch = s.split(" ");
		char [] c = s.toCharArray();
		int count=0, count1=0;
		System.out.println(ch.length);  // Length of the string
		
		for (int i = 0; i < c.length; i++) {
			
			char vowel = c[i];
			
			if ((vowel >='a' && vowel <='z') || (vowel >='A' && vowel <='Z')) {
				
			if (vowel == 'a' ||vowel == 'e' ||vowel == 'i' ||vowel == 'o' ||vowel == 'u') {
				count++;
			}
			
			
			
			if (!(vowel == 'a' || vowel == 'e' ||vowel == 'i' ||vowel == 'o' ||vowel == 'u')) {
				count1++;
			}
			}
		}
		
		System.out.println(count);
		System.out.println(count1);
	}

}
