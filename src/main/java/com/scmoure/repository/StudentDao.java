package com.scmoure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scmoure.domain.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

}
