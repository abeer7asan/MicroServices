package com.microservices.employee.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.employee.VO.Department;
import com.microservices.employee.VO.ResponseTemplateVO;
import com.microservices.employee.entity.Employee;
import com.microservices.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private RestTemplate  restTemplate;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}

	public ResponseTemplateVO getEmployeeWithDepartment(Long employeeId) {
		
		log.info("In EmployeeService.getEmployeeWithDepartment ");
		
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Optional<Employee> employee = employeeRepository.findById(employeeId);
		
		log.info("employee.getDepartmentId() = "+employee.get().getDepartmentId());
		

		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/find/"+employee.get().getDepartmentId(), Department.class);
		log.info("After Department Call in getEmployeeWithDepartment");
		log.info("department.getDepartmentId() = "+department.getDepartmentId());
		vo.setDepartment(department);
		vo.setEmployee(employee.get());
		log.info("befor return>>>>>>>");
		
		
		return vo;
		
		
	}
	
	

}
