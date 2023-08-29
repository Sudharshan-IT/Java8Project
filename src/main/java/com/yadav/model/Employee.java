package com.yadav.model;

public class Employee {

	private int empId;
	private String empName;
	private int empAge;
	private String empDesignation;
	private String empDomain;
	private double empSalary;
	private String empLocation;

	public Employee(int empId, String empName, int empAge, String empDesignation, String empDomain, double empSalary,
			String empLocation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empDesignation = empDesignation;
		this.empDomain = empDomain;
		this.empSalary = empSalary;
		this.empLocation = empLocation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpDomain() {
		return empDomain;
	}

	public void setEmpDomain(String empDomain) {
		this.empDomain = empDomain;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empDesignation="
				+ empDesignation + ", empDomain=" + empDomain + ", empSalary=" + empSalary + ", empLocation="
				+ empLocation + "]";
	}

}
