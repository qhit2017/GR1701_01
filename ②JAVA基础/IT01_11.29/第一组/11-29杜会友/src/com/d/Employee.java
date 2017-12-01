package com.d;

import sun.print.resources.serviceui;

public class Employee {
	private String id;
	private String name;
	private Double quarters;
	private String compensation;
	private String hiredate;
	//提供初始值 代码块方法略
	public Employee(String id, String name, Double quarters,
			String compensation, String hiredate) {
		this.id = id;
		this.name = name;
		this.quarters = quarters;
		this.compensation = compensation;
		this.hiredate = hiredate;
	}
	//提供set 和get 方法 用于访，调，查，改
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

	public Double getQuarters() {
		return quarters;
	}

	public void setQuarters(Double quarters) {
		this.quarters = quarters;
	}

	public String getCompensation() {
		return compensation;
	}

	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	//提供有参方法
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", quarters="
				+ quarters + ", compensation=" + compensation + ", hiredate="
				+ hiredate + "]";
	}

}
