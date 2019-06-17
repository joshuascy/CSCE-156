package com.datacontainers;


public class Person {
	
	private String firstName;
	private String lastName;
	private Address address; // Person class owns Address class as a field
	
	// Constructor
	public Person(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	// Getter and Setter methods
	public Address getAddress() {
		return this.address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
