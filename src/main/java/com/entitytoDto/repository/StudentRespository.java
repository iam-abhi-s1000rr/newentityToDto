package com.entitytoDto.repository;

import com.entitytoDto.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student,Long> {
}
