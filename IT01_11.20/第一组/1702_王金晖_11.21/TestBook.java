package com.tsinghua;

import com.zk.qhit.statictest.Book;

public class TestBook {
	public static void main(String[] args) {
		Book book = new Book("钢铁是怎样炼成的",58);
		System.out.println(book.getInfo());
	}
 
}
