package com.tsinghua;

import com.zk.qhit.statictest.Book;

/*作者：刘龑聪
 *E-mail：15539919713@163.com
 */
public class TestBook {
	public static void main(String[] args) {
		
		Book OliverTwist=new Book();
		OliverTwist.setName("雾都孤儿");
		OliverTwist.setType("长篇写实小说");
		OliverTwist.setPrice(59);
		OliverTwist.setPages(231);
		
		OliverTwist.getinfo();
		
		int NO=Book.NO();
		System.out.println(NO);
	}
}