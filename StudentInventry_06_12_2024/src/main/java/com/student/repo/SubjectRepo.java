package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Long>{

}
