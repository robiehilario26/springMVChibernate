package com.joseph.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joseph.dao.StudentDao;
import com.joseph.model.Student;
import com.joseph.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Transactional
	public void add(Student student) {
		// add
		studentDao.add(student);

	}

	@Transactional
	public void edit(Student student) {
		// edit
		studentDao.edit(student);

	}

	@Transactional
	public void delete(int studentId) {
		// delete
		studentDao.delete(studentId);

	}

	@Transactional
	public Student getStudent(int studentId) {
		// get student
		return studentDao.getStudent(studentId);
	}

	@Transactional
	public List getAllStudent() {
		// list
		return studentDao.getAllStudent();
	}

}
