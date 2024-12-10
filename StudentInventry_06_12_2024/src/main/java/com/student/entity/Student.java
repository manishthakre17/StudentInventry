package com.student.entity;


import java.util.ArrayList;
import java.util.List;

import com.student.mapper.StudentMapper;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;



@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="student_name")
	private String name;
	@Column(name="student_age")
	private int age;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
	private StudentIdCard studentIdCard;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
	private List<Subject> subject= new ArrayList<>();

	
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	public StudentIdCard getStudentIdCard() {
		return studentIdCard;
	}
	public void setStudentIdCard(StudentIdCard studentIdCard) {
		this.studentIdCard = studentIdCard;
		studentIdCard.setStudent(this);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", studentIdCard=" + studentIdCard
				+ ", subject=" + subject + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String name, int age, StudentIdCard studentIdCard, List<Subject> subject) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.studentIdCard = studentIdCard;
		this.subject = subject;
	}
	
	
}