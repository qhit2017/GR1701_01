package com.zk.qhit;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setName("三字经");
		b1.setPrice(49);
		b1.getInfo();
		
		Book b2 = new Book("弟子规",33);
		b2.getInfo();
	}
}
