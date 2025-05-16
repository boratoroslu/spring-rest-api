package com.boratoroslu.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boratoroslu.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1","Bora", "Toroslu"));
		employeeList.add(new Employee("2","Bahadır", "Özdemir"));
		employeeList.add(new Employee("3","Görkem", "İriağaç"));
		employeeList.add(new Employee("4","Enes", "Bayram"));
		employeeList.add(new Employee("5","Veli", "Türk"));
		
		return employeeList;
	}
	

}
