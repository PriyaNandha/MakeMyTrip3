package com.pack;

public class Task1 {

	
	public  Task1(int a) {

	
		//static int c;
		this("java");
		 a=20;
		System.out.println(a);
	
	}
	
	private Task1(String b) {

		System.out.println(b);
		
		
	}
	public static int Task1() {
		
		return 0;
		
	}

	public static void main(String[] args) {

		Task1 t1= new Task1(10);
		System.out.println(Task1());
	}


		
}
