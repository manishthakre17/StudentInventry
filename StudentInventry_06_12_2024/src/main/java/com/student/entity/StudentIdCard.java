package com.student.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.transaction.Transactional;

@Entity
public class StudentIdCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cardNumber;
	 @OneToOne // Bidirectional relationship
	 @JoinColumn(name="student")
	  private Student student;
	
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public StudentIdCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentIdCard(long id, String cardNumber, Student student) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.student = student;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Override
	public String toString() {
		return "StudentIdCard [id=" + id + ", cardNumber=" + cardNumber + ", student=" + student + "]";
	}
	
	
	
	
}
