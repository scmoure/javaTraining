package com.scmoure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scmoure.domain.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {

}
