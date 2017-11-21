package com.zk.qhit.statictest;

public class Book {

	/*
	 * a、给Book.java类创建四个私有成员变量；其中count为static的 。 b、在构造方法中实现count值的递增，
	 * 同时将count值进行稍微的转变赋值给变量no。 c、实现成员变量name, price的封装 。 d、为no,count提供只读操作 。
	 * e、getInfo（）方法输出书籍的基本信息 。 f、在com.tsinghua包下创建测试类TestBook.java 。
	 */// 定义
	String name;
	int character;
	double price;
	String author;

	// 参

	public Book(String read, int character, double price, String author) {
		this.name = name;
		this.character = character;
		this.price = price;
		this.author = author;
	}

	public String getRead() {
		return name;
	}

	public void setRead(String read) {
		System.out.println("时间简史");
	}

	public int getCharacter() {
		return character;
	}

	public void setCharacter(int character) {
		System.out.println(100000);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println(75.5);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		System.out.println("史蒂夫");
	}// 实现

	@Override
	public String toString() {
		return "Book [name=" + name + ", character=" + character + ", price="
				+ price + ", author=" + author + "]";
	}
}
