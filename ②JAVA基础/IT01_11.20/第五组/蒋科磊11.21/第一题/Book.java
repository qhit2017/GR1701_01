package com.zk.qhit.statictest;

public class Book {

	private String no;
	private String name;
	private double price;
	private static int count=0;
	public Book(){
		count++;
		no="TPOO"+count;
	}
	public Book(String name,double price){
		count++;
		no="TPOO"+count;
		this.name=name;
		this.price=price;
		
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	
	public static int getCount(){
		return count;
	}
	public String getNo(){
		return no;
	}
	public void getInfo(){
		System.out.println("编号："+this.getNo()+"《"+this.getName()
				+"》,图书馆共有藏书："+Book.getCount());
	}
	
}
