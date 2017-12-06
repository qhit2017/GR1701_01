package com.sxl;

public class Employee {

	 private String name;
	 private String id;
	 private double salary;
	 private String date;
	 private String department;
	public Employee() {
		
	}

	public Employee(String name, String id, double salary, String date) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary
				+ ", date=" + date + ", department=" + department + "]";
	}

	
	
	 
	 
	
}
