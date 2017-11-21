package com.tsinghua;

import com.zk.qhit.statictest.Book;

public class TestBook {

	public static void main(String[] args) {
		Book book = new Book();
		book.setName("从你的全世界路过");
		book.setPrice(250);
		book.getInfo();
	
		Book book1 = new Book("你的孤独，虽败犹荣",250);
		book1.getInfo();
	
	
	}
}
