package com.shreyas.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.shreyas.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
