package com.zk.qhit.statictest;

public class Book {
	
  //私有的成员变量
  private String name;
  private String no;
  private int    price;
 //计数器
  private static int count=0;
 public Book() {
	count++;
	no="L"+count;
}
 public Book(String name, int price) {
	count++;
	no="L"+count;
	this.name = name;
	this.price = price;
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
	this.price = price;
}
public String getNo() {
	return no;
}
public static int getCount() {
	return count;
}
public void getInfo(){
	System.out.println("编号"+this.getNo()+"《"+this.getName()+"》，图书馆藏书"+Book.getCount());
}
	
	
}

