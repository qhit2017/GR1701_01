package com.duhuiyou;


public class Taest {

	// 分别创建狗和老鼠的实例化对象，
	// 给对象的属性赋值，
	// 并且调用对象的吃、叫的方法

	static void testcry(Animal m) {
		m.cry();
	}

	public static void main(String[] args) {
		Animal c = new Mice();
		Animal m = new Dog();
		testcry(c);
		testcry(m);
	}
}
