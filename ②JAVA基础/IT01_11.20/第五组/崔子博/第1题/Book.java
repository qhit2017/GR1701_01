package com.zk.qhit.statictest;

public class Book {
	// a、创建四个私有成员变量；其中count为static的 。

	private String no;
	private String name;
	private double price;
	private static int count;

	// b、在构造方法中实现count值的递增，同时将count值进行稍微的转变赋值给变量no
	public Book() {
		count++;
		no = "tp00" + count;

	}

	public Book(String name, double price) {
		count++;
		no = "tp00" + count;
		this.name = name;
		this.price = price;

	}

	// c、实现成员变量name, price的封装 。
	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public double getprice() {
		return price;
	}

	public void setprice() {
		this.price = price;
	}

	// d、为no,count提供只读操作 。
	public static int getCount() {
		return count;

	}

	public String getNo() {
		return no;
	}

	// e、getInfo（）方法输出书籍的基本信息 。
	public void getInfo() {
		System.out.println("编号" + this.getNo() + "《" + this.getName() + "》,"
				+ "图书馆共有藏书：" + Book.getCount());
	}

	public void setPrice(double d) {
		// TODO Auto-generated method stub
		
	}

}
