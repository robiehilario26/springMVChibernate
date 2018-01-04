package com.joseph.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.joseph.dao.StudentDao;
import com.joseph.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Student student) {
		// add
		session.getCurrentSession().save(student);

	}

	@Override
	public void edit(Student student) {
		// edit or update
		session.getCurrentSession().update(student);

	}

	@Override
	public void delete(int studentId) {
		// dellete
		session.getCurrentSession().delete(getStudent(studentId));
	}

	@Override
	public Student getStudent(int studentId) {
		// get student
		return (Student) session.getCurrentSession().get(Student.class, studentId);
	}

	@Override
	public List getAllStudent() {
		// return list
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
