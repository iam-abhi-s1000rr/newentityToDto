package com.entitytoDto.controller;

import com.entitytoDto.dto.StudentDto;
import com.entitytoDto.entity.Student;
import com.entitytoDto.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class MyController {
    @Autowired private MyService service;

    @GetMapping("/show")
    public List<StudentDto> getAllStudent(){
        return service.getAllStudent();
    }

    @PostMapping("/save")
    public Student saveStudent(Student student){
        return service.saveStudent(student);
    }

    @PutMapping("/update")
    public StudentDto updateStudent(@RequestParam("id") long stdid, Student student){
        return service.updateStudent(stdid,student);
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("id") long stdid){
        service.deleteStudent(stdid);
        return "Data Deleted";
    }

}
