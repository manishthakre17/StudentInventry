package com.studentInvetory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentInvetory.entity.StudentIdCard;

public interface StudentIdCardRepository extends JpaRepository<StudentIdCard, Long> {

}
