package com.studentInvetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentInvetory.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
