package com.gaojie.qhit01;

/**
 * 作者：张彤彤
 * 
 * 创建时间：2017年11月23日 下午7:32:42
 */
public class Test {
	public static void main(String[] args) {

		Dog dog = new Dog("小狗", "狗类", "黄色", "11");

		Mice mice = new Mice("老鼠", "鼠类", "四只", "12g");

		System.out.println(dog.toString());
		dog.cry();
		dog.eat();

		mice.cry();
		mice.eat();
		System.out.println(mice.toString());
	}
}
