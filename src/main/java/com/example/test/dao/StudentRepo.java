
package com.example.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}