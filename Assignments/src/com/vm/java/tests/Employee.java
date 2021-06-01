package com.vm.java.tests;

public class Employee {
private String firstName;
private String lastName;
public Employee(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
public static void main(String[] args) {
	String fName = null;
	String lName = null;
	try {
		if(fName == null && lName == null) {
			throw new NullPointerException("entry is missing");
		}
	}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
	
}


}
