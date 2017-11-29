package com.zk.qhit.Statictest;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月20日 下午8:12:09
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Book {
	// a、给Book.java类创建四个私有成员变量；
	// 其中count为static的 。
	private String no;
	private String name;
	private double price;
	private static int count = 0;

	// b、在构造方法中实现count值的递增，
	// 同时将count值进行稍微的转变赋值给变量no。

	public Book() {
		count++;
		no = "T" + count;
	}

	public Book(String name, double price) {
		count++;
		no = "T" + count;
		this.name = name;
		this.price = price;
	}

	// c、实现成员变量name, price的封装
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// d、为no,count提供只读操作

	// e、getInfo（）方法输出书籍的基本信息 。
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Book.count = count;
	}

	public void getInfo() {
		System.out.println("书籍名字：" + this.getName() + "\t" + "编号："
				+ this.getNo() + "\t" + "价格：" + this.getCount());

	}

	public Book(String no, String name, double price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	// f、在com.tsinghua包下创建测试类TestBook.java 。

}
