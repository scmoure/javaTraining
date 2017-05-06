package com.scmoure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scmoure.repository.CiviliteDao;

@Service("civiliteService")
public class CiviliteService {
	@Autowired
	CiviliteDao civiliteDao;
}
