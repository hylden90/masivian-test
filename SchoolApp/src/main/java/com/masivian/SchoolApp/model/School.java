/**
 * 
 */
package com.masivian.SchoolApp.model;

import java.util.Set;

/**
 * @author Diego Bautista
 * 
 * This class models a School for SchoolApp
 */
public class School {
	
	private String name;
	
	private Set<Subject> subjects;
	
	private Set<Student> students;
	
	private Set<Grade> grades;
	
 /**
 * Getters, setters and collections access
 */
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
	public void removeSubject(Subject subject) {
		this.subjects.remove(subject);
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	public void removeStudent(Student student) {
		this.students.remove(student);
	}
	
	public void addGrade(Grade grade) throws IllegalArgumentException {
		if (grade.getGradeSize() >= 2 && grade.getGradeSize() <= 6)
			this.grades.add(grade);
		else
			throw new IllegalArgumentException("Students per grade must be between 2 and 6");
	}
	public void removeGrade(Grade grade) {
		this.grades.remove(grade);
	}
	

}
