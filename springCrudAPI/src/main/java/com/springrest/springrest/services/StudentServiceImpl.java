package com.springrest.springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.StudentDao;
import com.springrest.springrest.Entity.Student;

@Service
public class StudentServiceImpl implements StudentServices {

	@Autowired
	private StudentDao studentDao;
	
	//List<Student>list;
	public StudentServiceImpl() {
		
//		 
	}
	
	
	@Override
	public List<Student> getStudent() {
		 
		return studentDao.findAll();
	}


	@Override
	public Student getStudents(long studentid) {
		
//		Student s=null;
//		for(Student student:list)
//		{
//			if(student.getId()==studentid)
//			{
//				s=student;
//				break;
//			}
//		}
	return studentDao.getOne(studentid);
	}


	@Override
	public Student addStudent(Student student) {
		
		//list.add(student);
		studentDao.save(student);
		return student;
	}


	@Override
	public Student updateStudent(Student student) {
		
//		list.forEach(e -> {
//			if(e.getId()==student.getId()) {
//				e.setName(student.getName());
//				e.setEmail(student.getEmail());
//				e.setDepartment(student.getDepartment());
//			}
//			
//		});
		
		studentDao.save(student);
		return student;
	}


	@Override
	public void deleteStudent(long parseLong) {
		//list=this.list.stream().filter(e ->e.getId()!= parseLong).collect(Collectors.toList());
		Student entity = studentDao.getOne(parseLong);
		//Student entity = studentDao.getOne(parseLong);
		studentDao.delete(entity);
	}


	

}
