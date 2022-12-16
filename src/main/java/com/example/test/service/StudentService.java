package com.example.test.service;

import com.example.test.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	
	public Student getStudentById(Integer id);
	
	public void deleteStudentById(Integer id);
	
	
}
