package com.university.student.dto;

import java.util.Date;
import java.util.Set;

import com.university.shared.entity.CourseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDetailsDTO {
	
	int studentId;
	String name;
	String email;
	String phone;
	String Address;
	Date created_dt;
	Set<CourseEntity> courses;
}
