package com.greatlearning.studentmanagement.service;

import java.util.List;

import com.greatlearning.studentmanagement.entity.Student;

public interface StudentService {
	
	List<Student> listAll();
	
	void save(Student student);

	Student findById(int theId);
	
	void deleteById(int theId);
	

}
