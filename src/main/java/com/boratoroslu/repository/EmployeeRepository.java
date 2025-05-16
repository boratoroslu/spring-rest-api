package com.boratoroslu.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boratoroslu.model.Employee;

@Repository
public class EmployeeRepository {
	
	@Autowired
	private List<Employee> employeesList;

	public List<Employee> getAllEmployeeList(){
		
		return employeesList;
	}
	
	public Employee getEmployeeById(String id) {
		 Employee findEmployee = null;
		 
		for (Employee employee : employeesList) {
			if (id.equals(employee.getId())) {
				findEmployee = employee;
				break;
			}
		}
		return findEmployee;
	}
}
