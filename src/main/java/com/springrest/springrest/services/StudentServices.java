package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.Entity.Student;

public interface StudentServices {
	
	public List<Student>getStudent();

	public Student getStudents(long studentid);
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(long parseLong );

}
