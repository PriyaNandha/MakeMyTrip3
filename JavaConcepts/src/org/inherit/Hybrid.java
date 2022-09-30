package org.inherit;

public class Hybrid extends Child2 {

	public void hybrid() {

	System.out.println("Hybrid");
	
	}
	
public static void main(String[] args) {
	Hybrid h= new Hybrid();
	//h.parent();
	h.hybrid();
	h.child2();
}
}
