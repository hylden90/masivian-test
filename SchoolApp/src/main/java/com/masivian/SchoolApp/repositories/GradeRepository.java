package com.masivian.SchoolApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.masivian.SchoolApp.model.Grade;

public interface GradeRepository extends CrudRepository<Grade, Long> {

}
