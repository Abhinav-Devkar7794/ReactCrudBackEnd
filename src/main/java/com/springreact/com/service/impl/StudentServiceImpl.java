package com.springreact.com.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springreact.com.domain.Student;
import com.springreact.com.service.ServiceForAll;

@Service
@Qualifier("student")
public class StudentServiceImpl implements ServiceForAll<Student> {

private Long studentId = 100L;
	
	private Map<Long,Student> studentMap = new HashMap<Long,Student>();
	
	
	{
		
			Student student =new Student();
			
			student.setId(studentId);
			student.setFirstName("Abhinav");
			student.setLastName("Devkar");
			
			studentMap.put(studentId, student);
			
	}
	

	
	
	@Override
	public Collection<Student> findAll() {
		
		System.out.println(" Service find all student");
		return studentMap.values();
	}

	@Override
	public Student findById(Long id) {
		
		return null;
	}

	@Override
	public Student save(Student t) {
		
		return null;
	}

	@Override
	public Student update(Student t) {
	
		return null;
	}

	@Override
	public Student deleteById(Long id) {
		
		return null;
	}

}
