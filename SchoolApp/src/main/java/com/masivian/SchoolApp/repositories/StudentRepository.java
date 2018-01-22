package com.masivian.SchoolApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.masivian.SchoolApp.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
