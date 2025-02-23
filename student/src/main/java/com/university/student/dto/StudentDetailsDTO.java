package com.university.student.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetailsDTO {
	
	int studentId;
	String name;
	String email;
	String phone;
	String Address;
	Date created_dt;
}
