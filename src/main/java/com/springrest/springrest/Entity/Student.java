package com.springrest.springrest.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
@Id
 private long id;
 private String Name;
 private String Email;
 private String  department ;
 
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "Student [id=" + id + ", Name=" + Name + ", Email=" + Email + ", department=" + department + "]";
}
public Student(long id, String name, String email, String department) {
	super();
	this.id = id;
	Name = name;
	Email = email;
	this.department = department;
}
public Student() {
	super();
	
}
 

}
