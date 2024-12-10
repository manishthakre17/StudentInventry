package com.studentInvetory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="student")
@Data
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rollNumber")
	private long rollNumber;
	@Column(nullable = false,name="name")
	private String name;
	@Column(nullable = false,name="age")
	private int age;
	
	@OneToOne(mappedBy = "")
	private StudentIdCard studentIdCard;
	
	

}
