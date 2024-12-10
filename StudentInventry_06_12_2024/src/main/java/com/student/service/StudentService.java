package com.student.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.student.dto.StudentDTO;
import com.student.entity.Student;

public interface StudentService {
	
	 boolean createStudent(StudentDTO studentDTO);
	 List<StudentDTO> getAllStudents();
	 
}
