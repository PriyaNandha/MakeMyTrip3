package org.abs;

public class Class2 extends AbstractClass{



	@Override
	public void abstractClass() {

		System.out.println("Abstract method implemented");
	}

	public static void main(String[] args) {

		
		
		Class2 c= new Class2();
		c.abstractClass();
		c.classOne();
	}

	@Override
	public void interfaceClass() {
			System.out.println();		
	}

	@Override
	public void inter2() {
		System.out.println();
		
	}
}
