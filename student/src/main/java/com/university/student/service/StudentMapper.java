package com.university.student.service;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.university.student.dto.StudentDetailsDTO;
import com.university.shared.entity.StudentEntity;


@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper{
    StudentDetailsDTO toDTO(StudentEntity student);
    StudentEntity toEntity(StudentDetailsDTO studentDTO);
}
