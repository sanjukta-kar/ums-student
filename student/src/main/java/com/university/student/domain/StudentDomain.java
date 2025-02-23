package com.university.student.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.university.student.dto.StudentDetailsDTO;
import com.university.student.entity.StudentEntity;
import com.university.student.repository.StudentRepository;
import com.university.student.service.StudentMapper;

@Component
public class StudentDomain {

	@Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;
	
	public StudentEntity create(StudentDetailsDTO studentDetails) {
		StudentEntity student = studentMapper.toEntity(studentDetails);
		StudentEntity studentResponse = null;
		try {
        studentResponse = studentRepository.save(student);
		}catch (Exception e) {
			System.out.println("Exception in Save Student Method");
		}
		return studentResponse;
	}

	public StudentDetailsDTO getStudentByID(Integer id) {
		StudentEntity student = studentRepository.findById(id).orElseThrow();
        return studentMapper.toDTO(student);
	}
	
}
