package com.entitytoDto.service;

import com.entitytoDto.dto.StudentDto;
import com.entitytoDto.entity.Student;

import java.util.List;

public interface MyService {
    List<StudentDto> getAllStudent();


    Student saveStudent(Student student);

    StudentDto updateStudent(long stdid, Student student);

    void deleteStudent(long stdid);
}
