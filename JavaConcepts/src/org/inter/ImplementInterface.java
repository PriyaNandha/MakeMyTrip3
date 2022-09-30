package org.inter;

public class ImplementInterface implements InterfaceClass {

	
	@Override
	public void interfaceClass() {

		System.out.println("Implements inter1");
	}
	@Override
	public void inter2() {
		System.out.println("Implements inter2");
		
	}
	
	public static void main(String[] args) {
		ImplementInterface i = new ImplementInterface();
		i.interfaceClass();
		i.inter2();
	}
	

}
