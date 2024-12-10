package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentIdCard;

@Repository
public interface StudentIdCardRepo extends JpaRepository<StudentIdCard, Long>{

}
