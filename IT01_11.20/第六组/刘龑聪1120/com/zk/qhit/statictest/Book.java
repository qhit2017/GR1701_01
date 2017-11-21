package com.zk.qhit.statictest;
/*作者：刘龑聪
 *E-mail：15539919713@163.com
 */
public class Book {
	private String name;
	private float price;
	private String type;
	private int pages;
	
	private static int count=0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public static int NO() {
		return count;
	}
	
	public Book(){
		count++;
	}
	public void getinfo(){
		System.out.println("书名："+name+"\n类型："+type+"\n价格："+price+"元\n页数："+pages+"页");
	}
}