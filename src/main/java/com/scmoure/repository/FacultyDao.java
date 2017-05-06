package com.scmoure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scmoure.domain.Faculty;

@Repository
public interface FacultyDao extends JpaRepository<Faculty, Long> {

}
