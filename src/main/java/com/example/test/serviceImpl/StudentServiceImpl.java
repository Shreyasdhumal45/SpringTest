package com.example.test.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.test.dao.StudentRepo;
import com.example.test.model.Student;
import com.example.test.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
@Autowired
	private StudentRepo studentrepo;
	
	

	@Override
	public Student saveStudent(Student student) {
	    
		return studentrepo.save(student);
	}



	@Override
	public Student getStudentById(Integer id) {
		
		return studentrepo.getById(id);
	}



	@Override
	public void deleteStudentById(Integer id) {
		studentrepo.deleteById(id);
		
	}

}
