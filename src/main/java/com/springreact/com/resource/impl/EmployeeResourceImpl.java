package com.springreact.com.resource.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.com.domain.Employee;
import com.springreact.com.resource.Resource;
import com.springreact.com.service.ServiceForAll;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins =  "http://localhost:3000")
public class EmployeeResourceImpl implements Resource<Employee> {

	@Autowired
	@Qualifier("employee")
	public ServiceForAll<Employee> empService;
	
	@Override
	public ResponseEntity<Collection<Employee>> findAll() {
		// TODO Auto-generated method stub
		return new ResponseEntity<Collection<Employee>>(empService.findAll(),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Employee> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Employee> save(Employee t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Employee> update(Employee t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Employee> deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
