package com.gaojie.qhit01;

/**
 * 作者：张彤彤
 * 
 * 创建时间：2017年11月23日 下午7:16:21
 */
public class Dog implements IZoology {

	private String name;
	private String breed;
	private String colour;
	private String age;

	public Dog(String name, String breed, String colour, String age) {
		super();
		this.name = name;
		this.breed = breed;
		this.colour = colour;
		this.age = age;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("我是狗在吃饭");

	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("我是狗在叫");

	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", colour=" + colour
				+ ", age=" + age + "]";
	}

}
