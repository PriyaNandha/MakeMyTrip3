package org.abs;


import org.inter.InterfaceClass;

public abstract class AbstractClass implements InterfaceClass  {

	public abstract void abstractClass();
	
	
	public void classOne() {

		System.out.println("non abs");
	}
	
public static void main(String[] args) {
		InterfaceClass i = new InterfaceClass() {
			
			@Override
			public void interfaceClass() {
System.out.println("Abstractclass implements Interface");				
			}

			@Override
			public void inter2() {
				// TODO Auto-generated method stub
				
			}
		};
		i.interfaceClass();
}
}
