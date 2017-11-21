
package com.zk.qhit.statictest;
import java.util.Scanner;


public class Book {
	private static int count=0;
	private String name;
	/**
	 * @param name
	 * @param price
	 */
	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	private double price;
	private String no;
     Book(){
		count++;
	}
	void getinfo(){
		System.out.println("书名"+name+"价格"+price+"数量"+count+no);
	}
	
	
	
	
	
	
	
	
	
	
}
