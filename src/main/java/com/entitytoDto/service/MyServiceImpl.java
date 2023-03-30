package com.entitytoDto.service;

import com.entitytoDto.dto.StudentDto;
import com.entitytoDto.entity.Student;
import com.entitytoDto.repository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class MyServiceImpl implements MyService{

    @Autowired private StudentRespository stdRepository;
    @Override
    public List<StudentDto> getAllStudent() {
        return null/*stdRepository.findAll()*/;
    }

    @Override
    public Student saveStudent(Student student) {
        return stdRepository.save(student);
    }

    @Override
    public StudentDto updateStudent(long stdid, Student student) {
        StudentDto studentDto=null;
        student=stdRepository.getReferenceById(stdid);
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setAddress(student.getAddress());

        return studentDto;
    }

    @Override
    public void deleteStudent(long stdid) {
        stdRepository.deleteById(stdid);
    }


}
