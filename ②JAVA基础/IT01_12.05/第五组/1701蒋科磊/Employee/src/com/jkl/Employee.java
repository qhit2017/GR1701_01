package com.jkl;


public class Employee {

	private String number;
	private String name;
	private int salary;
	private String date;
	private String section;
	
	
	public Employee(String number, String name, int salary, String date,
			String section) {
		super();
		this.number = number;
		this.name = name;
		this.salary = salary;
		this.date = date;
		this.section = section;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", salary="
				+ salary + ", date=" + date + ", section=" + section + "]";
	}
	
	
}
