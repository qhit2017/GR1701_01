package com.machao;

public class Employee {

	
	private String id; 
	private String name;
	
	private double price;
	private String date;
	private String department;
	
	static {


	public Employee( String id,String name, double price, String date,
			String department) {
		
		this.id = id;
		this.name = name;
		
		this.price = price;
		this.date = date;
		this.department = department;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
		return "Employee [name=" + name + ", id=" + id + ", price=" + price
				+ ", date=" + date + ", department=" + department + "]";
	}

}
