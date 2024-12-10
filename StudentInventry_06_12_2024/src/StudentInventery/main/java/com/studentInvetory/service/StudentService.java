package com.studentInvetory.service;

import java.util.List;

import com.studentInvetory.dto.StudentDTO;
import com.studentInvetory.entity.Student;

public interface StudentService {
	
	List<StudentDTO> getAllStudents();
	
	boolean saveStudent(StudentDTO studentDTO);

}
