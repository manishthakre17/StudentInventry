package com.studentInvetory.utility;

import com.studentInvetory.dto.StudentDTO;
import com.studentInvetory.dto.StudentIdCardDTO;
import com.studentInvetory.entity.Student;
import com.studentInvetory.entity.StudentIdCard;


public class StudentMapper {
	
	public static Student studentEntityMapper(StudentDTO dto) {
		Student student = new Student();
		student.setAge(dto.getAge());
		student.setName(dto.getName());
		if(dto.getStudentIdCardDTO() != null) {
		StudentIdCard card = studentIdCardEntityMapper(dto.getStudentIdCardDTO());
		student.setStudentIdCard(card);
		}
		return student;
	}
	
	public static StudentDTO studentDTOMapper(Student student) {
		StudentDTO dto = new StudentDTO();
		dto.setAge(student.getAge());
		dto.setName(student.getName());
		if(student.getStudentIdCard() != null) {
			StudentIdCardDTO cardDTO =	studentIdCardDTOMapper(student.getStudentIdCard());
			dto.setStudentIdCardDTO(cardDTO);
		}
		return dto;
	}
	
	public static StudentIdCard studentIdCardEntityMapper(StudentIdCardDTO dto) {
		StudentIdCard studentIdCard = new StudentIdCard();
		studentIdCard.setCardNumber(dto.getCardNumber());
		return studentIdCard;
	}
	
	public static StudentIdCardDTO studentIdCardDTOMapper(StudentIdCard studentIdCard) {
		StudentIdCardDTO cardDTO = new StudentIdCardDTO();
		cardDTO.setCardNumber(studentIdCard.getCardNumber());
		return cardDTO;
	}
	

}
