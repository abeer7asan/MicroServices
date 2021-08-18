package com.microservices.employee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.employee.VO.ResponseTemplateVO;
import com.microservices.employee.entity.Employee;
import com.microservices.employee.service.EmployeeService;



@RestController
@RequestMapping("/employee")

public class EmployeeController {
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
	
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/find/{id}")
	
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long employeeId) {
		log.info("start EmployeeController.getUserWithDepartment");
		
		
		return employeeService.getEmployeeWithDepartment(employeeId);
	}
	

}
