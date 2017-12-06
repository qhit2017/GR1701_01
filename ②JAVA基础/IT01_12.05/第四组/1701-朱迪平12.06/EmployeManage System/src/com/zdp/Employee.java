package com.zdp;

/**
 * @author 作者 E-mail:271406@163.com
 * @date 创建时间：2017年11月28日 上午9:21:03
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Employee {

	// 方法
	private String id; // 地址
	private String name;// 姓名
	
	private double price;// 工资
	private String date;// 日期
	private String department;// 部门
	// 静态代码块
	static {

	}
	// 代码块
	{

	}

	// 构造方法（有参）

	public Employee( String id,String name, double price, String date,
			String department) {
		
		this.id = id;
		this.name = name;
		
		this.price = price;
		this.date = date;
		this.department = department;
	}

	// get/set 方法

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

	// toString方法
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", price=" + price
				+ ", date=" + date + ", department=" + department + "]";
	}

}
