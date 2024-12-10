package com.student.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.student.dto.StudentDTO;
import com.student.dto.StudentIdCardDTO;
import com.student.dto.SubjectDTO;
import com.student.entity.Student;
import com.student.entity.StudentIdCard;
import com.student.entity.Subject;

public class StudentMapper {
	
	//Student DTO to Student Entity
	public static Student getStudentEntity(StudentDTO studentDTO) {
		Student student = new Student();
		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setStudentIdCard(getStudentIdCardEntity(studentDTO.getStudentIdCardDTO()));
//		student.getStudentIdCard().setStudent(student); // add student in studentIdCard
//		List<Subject> listSubject = studentDTO.getSubject().stream().map(dto->getSubjectEntity(dto)).collect(Collectors.toList());
//		student.setSubject(listSubject);
//		student.getSubject().get(0).setStudent(student);
//		student.getSubject().stream().map(sub->sub.setStudent(student)).collect(Collectors.toList());
		return student;
	}
	
	//Student Entity to Student DTO
		public static StudentDTO getStudentDTO(Student student) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(student.getName());
			studentDTO.setAge(student.getAge());
//			System.out.println("studentIdCardDTO== "+student.getStudentIdCard());
			StudentIdCardDTO studentIdCardDTO = getStudentIdCardDTO(student.getStudentIdCard());
			studentDTO.setStudentIdCardDTO(studentIdCardDTO);
//			List<SubjectDTO> listSubjectDTO = student.getSubject().stream().map(entity->getSubjectDTO(entity)).collect(Collectors.toList());
//			studentDTO.setSubject(listSubjectDTO);
			return studentDTO;
		}
	
	//StudentIdCard DTO to StudentIdCard Entity
	public static StudentIdCard getStudentIdCardEntity(StudentIdCardDTO studentIdCardDTO) {
		StudentIdCard studentIdCard=new StudentIdCard();
		studentIdCard.setCardNumber(studentIdCardDTO.getCardNumber());
		return studentIdCard;
	}
	
		//StudentIdCard Entity to StudentIdCard DTO
		public static StudentIdCardDTO getStudentIdCardDTO(StudentIdCard studentIdCard) {
			StudentIdCardDTO studentIdCardDTO=new StudentIdCardDTO();
			studentIdCardDTO.setCardNumber(studentIdCard.getCardNumber());
			return studentIdCardDTO;
		}
		
		 // Subject Entity to SubjectDTO
	    private static SubjectDTO getSubjectDTO(Subject subject) {
	        SubjectDTO subjectDTO = new SubjectDTO();
	        subjectDTO.setSubject(subject.getSubject());
	        return subjectDTO;
	    }

	    // SubjectDTO to Subject Entity
	    private static Subject getSubjectEntity(SubjectDTO subjectDTO) {
	        Subject subject = new Subject();
	        subject.setSubject(subjectDTO.getSubject());
	        return subject;
	    }

}
