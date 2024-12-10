package com.studentInvetory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentInvetory.entity.Student;
import com.studentInvetory.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/getAll")
	public List<Student> getStudent(@RequestParam long rollNumber){
		System.out.println("rollNumber == > " + rollNumber);
		return studentService.getAllStudents();
	}
	
	@PostMapping("/createStudent")
	public String createStudent(@RequestBody Student student){
		
		boolean isSaved = studentService.saveStudent(student);
		if(isSaved) {
			return "Student Added";
		}else {
			return "Student Not Added";
		}
	}

}
