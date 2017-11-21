package com.zk.qhit.statictest;

//f、在com.tsinghua包下创建测试类TestBook.java 。
public class TestBook {
	public static void main(String[] args) {		
		Book b1 = new Book();
		b1.setName("大圣传");
		b1.setPrice(25.60);
		b1.getInfo();
		
		Book b2=new Book("西行记",18);
		b2.getInfo();
		
	}

}
