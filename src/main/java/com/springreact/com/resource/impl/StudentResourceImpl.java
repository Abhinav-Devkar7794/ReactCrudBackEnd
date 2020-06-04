package com.springreact.com.resource.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.com.domain.Student;
import com.springreact.com.resource.Resource;
import com.springreact.com.service.ServiceForAll;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentResourceImpl implements Resource<Student> {

	@Autowired
	@Qualifier("student")
	ServiceForAll<Student> service;
	
	@Override
	public ResponseEntity<Collection<Student>> findAll() {
		// TODO Auto-generated method stub
		return  new ResponseEntity<Collection<Student>>(service.findAll(),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Student> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Student> save(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Student> update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Student> deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
