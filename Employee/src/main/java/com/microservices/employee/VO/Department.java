package com.microservices.employee.VO;





import java.io.Serializable;




public class Department implements Serializable   {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1367323784175759038L;
	/**
	 * 
	 */

	private Long departmentId;
	private String departmentyName;
	private String departmentAddress;
	private String departmentCode;
	
	public Department()  {
		
	}
	
	public Department(Long departmentId, String departmentyName, String departmentAddress, String departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentyName = departmentyName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	
	
	
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentyName() {
		return departmentyName;
	}
	public void setDepartmentyName(String departmentyName) {
		this.departmentyName = departmentyName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	
	
	


}
