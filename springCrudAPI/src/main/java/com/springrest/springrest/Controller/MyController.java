package com.springrest.springrest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Entity.Student;
import com.springrest.springrest.services.StudentServices;

@RestController
public class MyController {
	
@Autowired
private StudentServices studentservices;  
	
	
	//get the Students
	@GetMapping("/Students")
	public List<Student>getStudent()
	{
		return this.studentservices.getStudent();
		    
	}
	
	@GetMapping("/Students/{studentid}")
	public Student getStudents(@PathVariable String studentid)
	{
		return this.studentservices.getStudents(Long.parseLong(studentid));
	}
	
//	Get Student by id
	@PostMapping("/Students")
	public Student addStudent(@RequestBody Student student) {
		return this.studentservices.addStudent(student);
	}
	
	//update Students
	@PutMapping("/Students")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentservices.updateStudent(student);
	}
	
//	delete Student
	@DeleteMapping("/Students/{studentid}")
	public ResponseEntity<HttpStatus>deleteStudent(@PathVariable String studentid)
	{
		try {
			this.studentservices.deleteStudent(Long.parseLong(studentid));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
