package org.emp;

import java.time.LocalDate;

public class Employee {

	public void empId() {
		int a = 12345;
		System.out.println("Employee id is " + a);
		System.out.println();
	}

	public void empName() {
		String name = "Priya";
		System.out.println("Employee Name is " + name);
		System.out.println();

	}

	public void empDob() {

		LocalDate dob = LocalDate.of(1991, 8, 12);
		System.out.println("Employee DOB is " + dob);
		System.out.println();

	}

	public void empPhone() {
		int phoneno = 1234567890;
		System.out.println("Employee phone number is " + phoneno);
		System.out.println();

	}

	public void empEmail() {
		String email = "abc@gmail.com";
		System.out.println("Employee email is " + email);
		System.out.println();

	}

	public void empAddress() {
		String address = "address";
		System.out.println("Employee address is " + address);
		System.out.println();

	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();

	}

}
