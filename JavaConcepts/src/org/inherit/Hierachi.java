package org.inherit;

public class Hierachi extends Parent {

	public void hierachi() {

	System.out.println("Hierachical");
	}
public static void main(String[] args) {
	Hierachi c = new Hierachi();
	c.parent();
	c.hierachi();
	
}
	
}
