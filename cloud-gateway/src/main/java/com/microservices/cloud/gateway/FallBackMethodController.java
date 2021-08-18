package com.microservices.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class FallBackMethodController {
	
	
	@GetMapping("/employeeServiceFallBack")
	public String EmployeeFallBackMethod() {
		return "Employee Service is taking more than expected time... Please try again";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String DepartmentFallBackMethod() {
		return "Department Service is taking more than expected time... Please try again";
	}

}
