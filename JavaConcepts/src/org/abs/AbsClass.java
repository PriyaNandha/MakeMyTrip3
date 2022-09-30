package org.abs;

import org.inherit.Child;

public abstract class AbsClass /* extends Child */ {

	public abstract void absClass();
	
	public static void main(String[] args) {
		Child c = new Child();
		c.child();
	
	}

}
