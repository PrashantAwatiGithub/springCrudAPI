package com.springrest.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.Entity.Student;

public interface StudentDao extends JpaRepository<Student,Long>{

}
