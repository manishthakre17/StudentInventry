package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.StudentDTO;
import com.student.entity.Student;
import com.student.mapper.StudentMapper;
import com.student.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo studentRepo;

	@Override
	public boolean createStudent(StudentDTO studentDTO) {		
			// TODO Auto-generated method stub
			Student student = StudentMapper.getStudentEntity(studentDTO);
//			student.setStudentIdCard(StudentMapper.getStudentIdCardEntity(studentDTO.getStudentIdCardDTO()));
			 studentRepo.save(student);
			 return true;
	}
	@Override
	public List<StudentDTO> getAllStudents(){		
		List<Student> student =studentRepo.findAll();
//		System.out.println("student2== "+student);
		 List<StudentDTO> dtos = new ArrayList<>();
			
			for(Student student2 : student) {
//				System.out.println("student2== "+student2);
				dtos.add(StudentMapper.getStudentDTO(student2));
			}
			
			return dtos;
	}
	
	

}
