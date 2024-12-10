package com.studentInvetory.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentInvetory.dto.StudentDTO;
import com.studentInvetory.entity.Student;
import com.studentInvetory.repository.StudentRepository;
import com.studentInvetory.utility.StudentMapper;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<StudentDTO> getAllStudents() {
		List<Student> student = studentRepository.findAll();
		
//	List<StudentDTO> dtos =	student.stream().map(StudentMapper::studentDTOMapper).collect(Collectors.toList());
		List<StudentDTO> dtos = new ArrayList<>();
		
		for(Student student2 : student) {
			dtos.add(StudentMapper.studentDTOMapper(student2));
		}
		
		return dtos;
		
		
	}

	@Override
	public boolean saveStudent(StudentDTO studentDTO) {
		boolean isSaved = false;
		Student student = StudentMapper.studentEntityMapper(studentDTO);
		studentRepository.save(student);
		isSaved = true;
		return isSaved;
	}

}
