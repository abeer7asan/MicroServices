package com.microservices.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.department.entity.Department;
import com.microservices.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public Optional<Department> findDepartmentById (Long departmentId) {
		return departmentRepository.findById(departmentId);
	
	}

}
