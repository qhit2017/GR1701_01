package com.zk.qhit.Statictest;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月20日 下午8:27:54
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class TestBook {
	// f、在com.tsinghua包下创建测试类TestBook.java 。
	public static void main(String[] args) {

		Book e1 = new Book();
		e1.setName("故事大全");
		e1.setNo("001");
		e1.setPrice(12.5);
		e1.getInfo();

		Book e2 = new Book("安徒生童话", 45);
		e2.getInfo();

	}

}
