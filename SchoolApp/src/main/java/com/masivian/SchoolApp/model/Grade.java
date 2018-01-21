/**
 * 
 */
package com.masivian.SchoolApp.model;

import java.util.Set;

/**
 * @author Diego Bautista
 *
 */
public class Grade {
	
	private String name;
	
	private Set<Student> students;
	
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
		
		

}
