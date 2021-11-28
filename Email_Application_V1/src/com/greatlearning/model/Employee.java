package com.greatlearning.model;

public class Employee {
	private String employeeFirstName;
	private String employeeLastName;
	
	public Employee(String employeeFirstName, String employeeLastName) {
		this.employeeFirstName=employeeFirstName;
		this.employeeLastName=employeeLastName;
		
	}
	
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName=employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName=employeeLastName;
	}
}
