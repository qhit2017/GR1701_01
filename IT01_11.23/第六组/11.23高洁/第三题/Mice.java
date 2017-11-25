package com.gaojie.qhit01;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月23日 下午7:29:21
 */
public class Mice implements IZoology {

	private String name;
	private String breed;
	private String leg;
	private String weight;

	public Mice(String name, String breed, String leg, String weight) {
		super();
		this.name = name;
		this.breed = breed;
		this.leg = leg;
		this.weight = weight;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("我是老鼠在吃饭");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("我是老鼠在叫");
	}

	@Override
	public String toString() {
		return "Mice [name=" + name + ", breed=" + breed + ", leg=" + leg
				+ ", weight=" + weight + "]";
	}

}
