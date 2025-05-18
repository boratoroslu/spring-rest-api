package com.boratoroslu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boratoroslu.controller.RestEmployeeController;
import com.boratoroslu.model.Employee;
import com.boratoroslu.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final RestEmployeeController restEmployeeController;
	
	@Autowired
	private EmployeeRepository employeeRepository;


    EmployeeService(RestEmployeeController restEmployeeController) {
        this.restEmployeeController = restEmployeeController;
    }
	
	
	public List<Employee> getAllEmployeeList(){
		
		employeeRepository.getAllEmployeeList();
		return employeeRepository.getAllEmployeeList();
	
	}

	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}
	
	public List<Employee> getEmployeeWithParams(String firstNameString , String lastName){
		
		return employeeRepository.getEmployeeWithParams(firstNameString, lastName);
	}
	
	public Employee saveEmployee(Employee newEmployee) {
		return employeeRepository.saveEmployee(newEmployee);
	}
	
	public boolean deleteEmployee(String id) {
		return employeeRepository.deleteEmployee(id);
	}
	public Employee updateEmployee(String id , UpdateEmployeeRequest request) {
		return employeeRepository.updateEmployee(id, request);
	}
}
