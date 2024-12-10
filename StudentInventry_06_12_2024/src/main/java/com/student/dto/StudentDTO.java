package com.student.dto;

import java.util.ArrayList;
import java.util.List;

import com.student.entity.Student;
import com.student.entity.StudentIdCard;
import com.student.entity.Subject;


public class StudentDTO {
	


	private String name;

	private int age;

	private StudentIdCardDTO studentIdCardDTO;
	
	private List<SubjectDTO> subject = new ArrayList<>();

	
	public StudentDTO(String name, int age, StudentIdCardDTO studentIdCardDTO, List<SubjectDTO> subject) {
		super();
		this.name = name;
		this.age = age;
		this.studentIdCardDTO = studentIdCardDTO;
		this.subject = subject;
	}
	

	public List<SubjectDTO> getSubject() {
		return subject;
	}

	public void setSubject(List<SubjectDTO> subject) {
		this.subject = subject;
	}

	public StudentIdCardDTO getStudentIdCardDTO() {
		return studentIdCardDTO;
	}
	public void setStudentIdCardDTO(StudentIdCardDTO studentIdCardDTO) {
		this.studentIdCardDTO = studentIdCardDTO;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", age=" + age + ", studentIdCardDTO=" + studentIdCardDTO + ", subject="
				+ subject + "]";
	}


	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
