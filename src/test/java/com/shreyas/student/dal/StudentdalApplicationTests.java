package com.shreyas.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shreyas.student.dal.entities.Student;
import com.shreyas.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository repo;
	
	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("AWS");
		student.setFee(30d);
		repo.save(student);
	}

	@Test
	void findStudentById() {
		Student student = repo.findById(1l).get();
		System.out.print(student);
	}
	
	@Test
	void testUpdateStudent() {
		Student student = repo.findById(1l).get();
		student .setFee(40d);
		repo.save(student);
	}
	
	@Test
	void testDeleteSudent() {
		Student student = repo.findById(1l).get();
		repo.delete(student);
	}
}
