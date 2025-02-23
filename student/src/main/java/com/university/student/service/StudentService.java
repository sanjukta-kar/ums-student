package com.university.student.service;

import org.springframework.stereotype.Service;

import com.university.student.dto.StudentDetailsDTO;
import com.university.student.entity.StudentEntity;

@Service
public interface StudentService {
	
	 public StudentEntity saveStudent(StudentDetailsDTO studentDTO);
	 public StudentDetailsDTO getStudent(Integer id);
    
}
