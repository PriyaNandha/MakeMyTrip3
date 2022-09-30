package org.abs;

public abstract class AbsClass2 extends AbsClass{

	public abstract void absClass2();


	public static void main(String[] args) {
		AbsClass a = new AbsClass() {
			
			@Override
			public void absClass() {
System.out.println("Abstarctclass extends Abstractclass");
				
			}
		};
		a.absClass();
	}
}
