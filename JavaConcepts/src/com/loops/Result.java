package com.loops;
import java.util.Scanner;
public class Result {
	public void result() {
		int j = 1;
		do {
			System.out.println("Enter the score ");
			Scanner s = new Scanner(System.in);
			int i = s.nextInt();
			if (i < 50) {
				System.out.println("student is fail");
			} 
			else if (i >= 50 && i <= 60) {
				System.out.println("Student grade is E ");
			}
			else if (i >= 60 && i <=70) {
				System.out.println("Student grade is D ");
			}
			else if (i >= 70 && i <= 80) {
				System.out.println("Student grade is C ");
			} 
			else if (i >= 80 && i <= 90) {
				System.out.println("Student grade is B ");

			} 
			else if (i >= 90 && i <= 95) {
				System.out.println("Student grade is A ");
			} 
			else {
				System.out.println("Student is topper");
			}
			j++;
		} while (j <= 5);
	}

	public static void main(String[] args) {

		Result r = new Result();
		r.result();
	}

}
