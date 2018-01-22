/**
 * 
 */
package com.masivian.SchoolApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Diego Bautista
 * 
 * This class models a student for SchoolApp
 */

@Entity
@Table(name = "STUDENT")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Column(name = "LASTNAME")
	private String lastName;
	
	@Column(name = "NEIGHBORHOOD")
	private Neighborhood neighborhood;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "EMAIL")
	private String email;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "GRADE_ID")
	private Grade grade;
	
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
	
	public Grade getGrade() {
		return this.grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	//JPA Only
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String address, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
	}
}
