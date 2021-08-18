package com.microservices.employee.VO;

import java.io.Serializable;

import com.microservices.employee.entity.Employee;
import com.microservices.employee.VO.Department;



public class ResponseTemplateVO  {

    
	private Employee employee;
	private Department department;
	
	
	public ResponseTemplateVO() {
		
	}
	
	public ResponseTemplateVO(Employee employee, Department department) {
		super();
		this.employee = employee;
		this.department = department;
	}
	
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
