package com.student.dto;

import com.student.entity.Student;

import jakarta.persistence.OneToOne;

public class StudentIdCardDTO {
	private String cardNumber;
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Override
	public String toString() {
		return "StudentIdCard [ cardNumber=" + cardNumber +"]";
	}
	public StudentIdCardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentIdCardDTO(String cardNumber) {
		super();
		this.cardNumber = cardNumber;
		
	}
	

}
