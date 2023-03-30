package com.entitytoDto.converter;

import com.entitytoDto.dto.StudentDto;
import com.entitytoDto.entity.Student;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {
    //entity to dto
    /*public StudentDto entityToDto(Student student){
        StudentDto studentDto=new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setAddress(student.getAddress());
        return studentDto;
    }*/

    @Autowired
    private ModelMapper modelMapper;

    //entity to dto by using modelmapper
    public StudentDto entityToDto(Student student ){
        StudentDto studentDto=this.modelMapper.map(student,StudentDto.class);
        return studentDto;
    }

    //dto to entity
    /*public Student dtoToEntity(StudentDto studentDto){
        Student student=new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setAddress(studentDto.getAddress());
        return student;
    }*/
    //dto to entity by using modelmapper

   public Student dtoToEntity(StudentDto studentDto){
       Student student=this.modelMapper.map(studentDto,Student.class);
       return student ;
   }

}
