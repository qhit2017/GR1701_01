package com.zk.qhit.statictest;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月20日 下午8:17:57
 */
public class Book {

	private String name;
	private int price;
	private String no;
	private static int count = 0;

	public Book() {
		count++;
		no = "TPOO" + count;
	}

	public Book(String name, int price) {
		count++;
		no = "TPOO" + count;
		this.name = name;
		this.price = price;
	}

	public static int getCount() {
		return count;
	}

	public String getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price <= 0) {
			System.out.println("你不是来买书的");
		}
		this.price = price;
	}

	public void getInfo() {
		System.out.println(" 编号： " + this.getNo() + " 名称为： " + this.getName()
				+ "  共有藏书 " + Book.getCount());
	}

}
