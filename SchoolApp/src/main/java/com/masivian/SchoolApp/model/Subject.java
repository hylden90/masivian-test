/**
 * 
 */
package com.masivian.SchoolApp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Diego Bautista
 *
 * This class models a Subject for SchoolApp
 */
@Entity
@Table(name = "subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToMany
	@JoinTable(name = "grade_subject",
			joinColumns = @JoinColumn(name = "SUBJECT_ID", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "GRADE_ID", referencedColumnName = "id"))
	private Set<Grade> grades = new HashSet<Grade>();
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {	
		return name;
	}
	public void setName(String name) {
		this.name = name;		
	}
	
	public Set<Grade> getGrades(){
		return this.grades;
	}
	public void setGrades(Set<Grade> grades) {
		this.grades = grades;
	}
	
	//JPA only
	public Subject() {
		
	}
	
	public Subject(String name) {
		this.name = name;
	}
	
}
