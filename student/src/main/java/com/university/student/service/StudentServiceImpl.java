package com.university.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.student.domain.StudentDomain;
import com.university.student.dto.StudentDetailsDTO;
import com.university.shared.entity.StudentEntity;
import com.university.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDomain domain;


    public StudentEntity saveStudent(StudentDetailsDTO studentDTO) {
		return domain.create(studentDTO);
    }

    public StudentDetailsDTO getStudent(Integer id) {
        return domain.getStudentByID(id);
    }
}
