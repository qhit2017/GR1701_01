package com.qhit.Animal;


public class Mouse implements Animal {

	String name;
	String breed;
	int leg;
	private double weight;

	Mouse() {
		System.out.println("我是一个鼠类的无参构造方法");
	}

	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "奶酪";
	}

	@Override
	public String getCry() {
		// TODO Auto-generated method stub
		return "唧";
	}

	public double getWeight() {
		return 10.9;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
