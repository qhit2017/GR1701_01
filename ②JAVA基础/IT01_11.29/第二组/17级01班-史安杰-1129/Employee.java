package com.saj;

public class Employee {
	private String id;
	private String name;
	private double wage;
	private String date;
	private String department;

	public Employee(String id, String name, double wage, String date,
			String department) {
		this.id = id;
		this.name = name;
		this.wage = wage;
		this.date = date;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
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
		return "Employee [id=" + id + ", name=" + name + ", wage=" + wage
				+ ", date=" + date + ", department=" + department + "]";
	}

}
