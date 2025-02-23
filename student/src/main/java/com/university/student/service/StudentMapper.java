package com.university.student.service;

import org.mapstruct.Mapper;

import com.university.student.dto.StudentDetailsDTO;
import com.university.student.entity.StudentEntity;

@Mapper(componentModel = "spring")
public interface StudentMapper{
    StudentDetailsDTO toDTO(StudentEntity student);
    StudentEntity toEntity(StudentDetailsDTO studentDTO);
}
