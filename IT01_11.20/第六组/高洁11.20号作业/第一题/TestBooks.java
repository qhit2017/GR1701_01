package com.zk.qhit.statictest;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月20日 下午8:52:28
 */
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