package com;

public class Dog implements Animal {

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getShout() {
		// TODO Auto-generated method stub
		return null;
	}
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	private String  breed;
	private String color;
	private int age;
	Dog(){}
	Dog(String name){
		System.out.println("tom");
	}
	
}
