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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Diego Bautista
 *
 */
@Entity
@Table(name = "GRADE")
public class Grade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@OneToMany(mappedBy = "grade")
	private Set<Student> students = new HashSet<Student>();
	
	@ManyToMany
	@JoinTable(name = "grade_subject",
			joinColumns = @JoinColumn(name = "GRADE_ID", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "SUBJECT_ID", referencedColumnName = "id"))
	private Set<Subject> subjects = new HashSet<Subject>();
	
	public String getName() {		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public void removeStudent(Student student) {
		this.students.remove(student);
	}
	
	public int getGradeSize() {
		return this.students.size();
	}
		
	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
	public void removeSubject(Subject subject) {
		this.subjects.remove(subject);
	}
	
	//JPA only
	public Grade() {
		
		
	}
	
	public Grade(String name) {
		this.name = name;
	}

}
