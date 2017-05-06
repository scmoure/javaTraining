package com.scmoure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scmoure.repository.StudentDao;

@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;
}
