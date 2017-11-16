package com.zz.sxl;

public class Commodity {
	/**
	 * 1、创建商品类， commodity number NAME type sort
	 * /创建商品类，并给出商品编号、名称、价格、型号、类别五个属性和打印自身信息方法，实例化对象，并观察成员变量赋值情况；
	 */
	String name;
	int price;
	int number;
	String type;
	String sort;

	public void method() {
		System.out.println("商品名称：" + name + "\n价格：" + price + "\n" + "编号"
				+ number + "\n型号" + type + "\n类别" + sort);
	}
}
