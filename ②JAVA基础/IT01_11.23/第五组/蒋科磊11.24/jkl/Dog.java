package com.jkl;

public class Dog implements Zoology{

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shout() {
		// TODO Auto-generated method stub
		return null;
	}

	private String name;
	private String breed;
	private String color;
	private int age;
	
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	Dog (String name){
		this.name=name;
	}
	
	
	
	
	
	
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

		
	
}
