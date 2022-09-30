package org.inherit;

import org.abs.AbstractClass;
import org.w3c.dom.views.AbstractView;
import org.w3c.dom.views.DocumentView;

public class Parent implements AbstractView {

	public void parent() {

	System.out.println("Parent");
	
	}

	@Override
	public DocumentView getDocument() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		AbstractClass a = new AbstractClass() {
			
			@Override
			public void abstractClass() {
				System.out.println("Class implements Abstractclass");
			}

			@Override
			public void interfaceClass() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void inter2() {
				// TODO Auto-generated method stub
				
			}
		};
		a.abstractClass();
	}
}