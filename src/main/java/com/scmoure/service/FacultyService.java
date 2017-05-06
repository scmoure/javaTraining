package com.scmoure.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scmoure.domain.Civilite;
import com.scmoure.domain.Department;
import com.scmoure.domain.Faculty;
import com.scmoure.domain.Student;
import com.scmoure.repository.FacultyDao;

@Service
public class FacultyService {
	@Autowired
	FacultyDao facultyDao;
	
	public void save(Faculty faculty) {
		facultyDao.save(faculty);
	}
	
	public Faculty create() {
		Faculty faculty = new Faculty();
//		faculty.setId(1L);
		faculty.setName("faculty 1");
//		facultyDao.save(faculty);
		List<Student> students = new ArrayList<Student>();
		List<Department> departments = new ArrayList<Department>();
		for (int i = 1; i < 5; i++) {
			Student stu = new Student();
//			stu.setId((long) i);
			Civilite civ = new Civilite();
			civ.setId((long) ((i % 2) + 1));
			stu.setCivilite(civ);
			stu.setName("student " + i);
			stu.setFaculty(faculty);
			students.add(stu);
			
			Department dep = new Department();
//			dep.setId((long) i);
			dep.setName("department " + i);
			dep.setFaculty(faculty);
			departments.add(dep);
		}
		faculty.setStudents(students);
		faculty.setDepartments(departments);
		facultyDao.save(faculty);
		return faculty;
	}
	
	public Faculty modify() {
		Faculty faculty = new Faculty();
		faculty.setId(54L);
		faculty.setName("faculty 1 modified");
//		facultyDao.save(faculty);
		List<Student> students = new ArrayList<Student>();
		List<Department> departments = new ArrayList<Department>();
		for (int i = 55; i < 59; i++) {
			Student stu = new Student();
			stu.setId((long) i + 4);
			Civilite civ = new Civilite();
			civ.setId((long) (((i+1) % 2) + 1));
			stu.setCivilite(civ);
			stu.setName("student " + i + " modified");
			stu.setFaculty(faculty);
			students.add(stu);
			
			Department dep = new Department();
			dep.setId((long) i);
			dep.setName("department " + i + " modified");
			dep.setFaculty(faculty);
			departments.add(dep);
		}
		faculty.setStudents(students);
		faculty.setDepartments(departments);
		facultyDao.save(faculty);
		return faculty;
	}
	
	public void deleteAll() {
		facultyDao.deleteAll();
	}
}
