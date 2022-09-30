package org.task.mini;

public class TaskOnes {

	private static void main(String a) { // it will compile the program but we will get runtime error as it is not
											// public or main method not found

		System.out.println(a);
	}

	static void main(int a) { // method created with no return type

		System.out.println(a);
	}

	void main(float a) { // method doesn't return anything

		System.out.println(a);

	}

	public static void main(String[] args) { // while compiling the program JVM will search for main method

		TaskOnes.main(20);
		main(10);
		main("This");

	}

}
