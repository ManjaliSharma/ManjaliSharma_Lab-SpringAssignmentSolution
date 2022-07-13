package com.greatlearning.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.greatlearning.studentmanagement.entity.Student;
import com.greatlearning.studentmanagement.repository.StudentRepository;

@Service
@Repository
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> listAll() {
		
		return studentRepository.findAll();
	}

	@Override
	public void save(Student student) {
		
		studentRepository.save(student);
		
	}
	
	public Student findById(int id) {
		
		return studentRepository.findById(id).get();
		
	}
	@Override
	public void deleteById(int theId) {
		
		studentRepository.deleteById(theId);
		
	}


}
