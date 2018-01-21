/**
 * 
 */
package com.masivian.SchoolApp.model;

/**
 * @author Diego Bautista
 * 
 * This class models a student for SchoolApp
 */
public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private Neighborhood neighborhood;
	
	private String address;
	
	private String email;
	
/**
 * Getters and setters
 */
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Neighborhood getNeighborhood() {
		return this.neighborhood;
	}
	public void setNeighborhood(Neighborhood neighborhood) {
		this.neighborhood = neighborhood;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
