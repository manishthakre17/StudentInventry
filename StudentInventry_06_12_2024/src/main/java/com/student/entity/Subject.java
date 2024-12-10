package com.student.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String subject;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Student student;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", subject=" + subject + ", student=" + student + "]";
	}

	public Student getStudent() {
		return student;
	}

	public int setStudent(Student student) {
		this.student = student;
		return 1;
	}
	
	
	

}
