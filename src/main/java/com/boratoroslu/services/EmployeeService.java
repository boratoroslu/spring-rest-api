package com.boratoroslu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boratoroslu.model.Employee;
import com.boratoroslu.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployeeList(){
		
		employeeRepository.getAllEmployeeList();
		return employeeRepository.getAllEmployeeList();
	
	}

	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}
}
