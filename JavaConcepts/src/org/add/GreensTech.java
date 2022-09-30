package org.add;

public class GreensTech {

	String address;

	public void greensOmr() {
		address = "No.19, Balamurugan St, Perambur, Chennai, Tamil Nadu 600039";
		System.out.println("GreensTech Annanagar address is " );
		System.out.println( address);
		System.out.println();

	}

	public void greensAdayar() {

		address = "10/15, 1st St, Padmanabha Nagar, Adyar, Chennai, Tamil Nadu 600020";
		System.out.println("GreensTech Adyar address is " + address);
		System.out.println();

	}

	public void greensTambaram() {
		address = "Tambaram Sanatorium, 1, Chennai - Theni Hwy, near HP Petrol Bulk, "
				+ "Opposite Arulmigu Sri Rama Anjaneyar Temple, Apparao Colony, Tambaram Sanatoruim, Chennai, Tamil Nadu 600047";
		System.out.println("GreensTech Annanagar address is " + address);
		System.out.println();

	}

	public void greensVelacherry() {

		address = "#28, Nagendra Nagar, opposite Phoenix Market City, Velachery, Chennai, Tamil Nadu 600042";
		System.out.println("GreensTech Annanagar address is " + address);
		System.out.println();

	}

	public void greensAnnanagar() {

		address = "4th floor, W122, 3rd Ave, W Block, Annanagar East, Chennai, Tamil Nadu 600040";
		System.out.println("GreensTech Annanagar address is " + address);
		System.out.println();

	}

	public static void main(String[] args) {
		GreensTech gt = new GreensTech();
		gt.greensOmr();
		gt.greensAdayar();
		gt.greensTambaram();
		gt.greensVelacherry();
		gt.greensAnnanagar();

	}
}
