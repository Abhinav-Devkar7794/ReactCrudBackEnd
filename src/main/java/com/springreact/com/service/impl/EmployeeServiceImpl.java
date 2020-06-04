package com.springreact.com.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springreact.com.domain.Employee;
import com.springreact.com.service.ServiceForAll;

@Service
@Qualifier("employee")
public class EmployeeServiceImpl implements ServiceForAll<Employee> {

	private Long empId = 100L;
	
	private Map<Long,Employee> empMap = new HashMap<Long,Employee>();
	
	
	{
		
		Employee emp = new Employee();
		emp.setId(empId);
		emp.setFirstName("Abhi");
		emp.setLastName("Dev");
		
		empMap.put(empId, emp);
		
		
	}
	
	@Override
	public Collection<Employee> findAll() {
		// TODO Auto-generated method stub
		System.out.println(" Service find all employee");
		return empMap.values();
	}

	@Override
	public Employee findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee save(Employee t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(Employee t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
