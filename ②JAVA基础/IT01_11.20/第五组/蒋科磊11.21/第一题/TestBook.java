package com.zk.qhit.statictest;

public class TestBook {

	public static void main(String[] args) {
		Book b1=new Book();
		b1.setName("未来的战争");
		b1.setPrice(34.5);
		b1.getInfo();
		
		Book b2=new Book("三毛流浪记",23);
		b2.getInfo();
	}
}
