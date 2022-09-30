package org.inherit;

import org.abs.AbstractClass;

public class Child2 extends AbstractClass {

	public void child2() {
		System.out.println("Child2");
	}
		@Override
	public void abstractClass() {
		System.out.println("Class extends Abstractclass");
	}
		public static void main(String[] args) {
			Child2 a= new Child2();
			//a.parent();
		//	a.child2();
			a.abstractClass();
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
