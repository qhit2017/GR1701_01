package com.gaojie.qhit01;

import java.util.ArrayList;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月29日 下午3:51:25
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> alist = new ArrayList<Employee>();

		alist.add(new Employee("TP001", "荆轲", "5500", "2000.01.01", "刺客部"));
		alist.add(new Employee("TP002", "孙尚香", "7600", "2001.01.01", "射手部"));
		alist.add(new Employee("TP003", "花木兰", "5533", "1998.05.03", "战士部"));
		alist.add(new Employee("TP004", "高渐离", "9999", "1999.03.26", "法师部"));

		alist.size();
		for (int i = 0; i < alist.size(); i++) {
			Employee s = alist.get(i);
			System.out.println(s);
		}
		System.out.println();
		for (Employee s : alist) {
			System.out.println(s);
		}
	}
}
