package com.arrays;

public class Division {
	public static void main(String[] args) {

		int a[][] = { { 10, 20 }, { 30, 40 } };

		int b[][] = { { 2, 5 }, { 5, 5 } };

		int sum[][] = new int[2][2];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				sum[i][j] = a[i][j] / b[i][j];
				System.out.print(sum[i][j] + " ");

			}
			System.out.println();
		}

	}
}
