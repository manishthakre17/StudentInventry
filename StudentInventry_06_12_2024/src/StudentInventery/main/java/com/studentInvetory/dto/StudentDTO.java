package com.studentInvetory.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDTO {
	private String name;
	private int age;
	
	private StudentIdCardDTO studentIdCardDTO; 

}
