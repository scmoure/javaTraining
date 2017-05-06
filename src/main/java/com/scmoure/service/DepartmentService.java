package com.scmoure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scmoure.repository.DepartmentDao;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDao departmentDao;
}
