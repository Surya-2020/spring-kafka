package com.springboot.kafka.model;

public class Employee {

	private String name;
	private String companyName;
	private int employeeNo;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, String companyName, int employeeNo, double salary) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.employeeNo = employeeNo;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", companyName=" + companyName + ", employeeNo=" + employeeNo + ", salary="
				+ salary + "]";
	}

}
