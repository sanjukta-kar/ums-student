package com.university.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.university.student.dto.StudentDetailsDTO;
import com.university.shared.entity.StudentEntity;
import com.university.student.service.StudentService;

@RestController("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/welcome")
	public String startingMethod() {
		return "Hello!";
	}
	@PostMapping("/create")
	public ResponseEntity<StudentEntity> createStudent(@RequestBody StudentDetailsDTO studentDTO) {
        StudentEntity student = studentService.saveStudent(studentDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
	}
	@GetMapping("/getById")
	public ResponseEntity<StudentDetailsDTO> getStudentByID(@RequestParam int id) {
        StudentDetailsDTO student = studentService.getStudent(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
	}
}
