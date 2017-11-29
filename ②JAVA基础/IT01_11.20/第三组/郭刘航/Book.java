package com.zk.qhit.statictest;

import javax.swing.plaf.nimbus.State;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月21日 上午8:47:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {

	//给Book.java类创建四个私有成员变量；其中count为static的
	private String name;
	private static int count = 0;
	private int NO;
	private double price;
	public Book(String name, int NO, int price) {
		count++;
		this.name = name;
		this.NO = NO;
		this.price = price;
	}
	
	void getInfo(){
		System.out.println("书籍信息："+"\n"+"书名："+getName()+"\n"+"价格；"+getPrice());
	}
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
	
	
	
	
	
}
