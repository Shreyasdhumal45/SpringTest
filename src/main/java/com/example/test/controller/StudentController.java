package com.example.test.controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.Student;
import com.example.test.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	LoggerFactory.g
@Autowired
	private StudentService studentservice;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody() Student student){
		
		
	Student stu=	studentservice.saveStudent(student);
		
		return ResponseEntity.ok().body(stu);
	}	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer id){
		
		
	Student stu=studentservice.getStudentById(id);
		
		return  ResponseEntity.ok() .body(stu);
	}
	@DeleteMapping("delete/{id}")
	public void deleteStudentById(@PathVariable("id") Integer id) {
		
		
		studentservice.deleteStudentById(id);
	}
	} 
	
	
	
	
	

