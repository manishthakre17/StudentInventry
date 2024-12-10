package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentDTO;
import com.student.entity.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	 @PostMapping("createStudent")
	    public String saveStudent(@RequestBody StudentDTO studentDTO) {
		 System.out.println(studentDTO.getName());
			System.out.println(studentDTO.getAge());
			System.out.println(studentDTO.getStudentIdCardDTO());
		//  System.out.println("Controller======================> "+studentDTO.toString());
		 boolean isSaved  = studentService.createStudent(studentDTO);
	        return "Student Added";
	    }
	 
	 @GetMapping("allStudents")
	 public List<StudentDTO> getAllStudents() {
		 return studentService.getAllStudents();
//		 return ResponseEntity.status(HttpStatus.OK).body(allStudents);
	 }
	 


}
