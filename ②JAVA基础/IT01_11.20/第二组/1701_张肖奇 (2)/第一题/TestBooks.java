package com.zk.qhit.statictest;


public class TestBooks {
	public static void main(String[] args) {

		Book book = new Book();

		book.setName("十万个为什么");
		book.setPrice(25);
		book.getInfo();

		Book b2 = new Book("格林童话", 33);
		b2.getInfo();

	}
}