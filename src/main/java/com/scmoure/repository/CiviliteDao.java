package com.scmoure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scmoure.domain.Civilite;

public interface CiviliteDao extends CrudRepository<Civilite, Long> {

}
