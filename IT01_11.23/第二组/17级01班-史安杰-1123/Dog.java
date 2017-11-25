package com.saj;

public class Dog implements Animal{
	String name;
	String breed;
	String color;
	private int age;
	
	
	
	public Dog() {
		
	}



	public Dog(String name) {
		this.name = name;
	}



	@Override
	public void eat() {
		
		System.out.println(name+"在吃骨头");
		// TODO Auto-generated method stub
		
	}



	@Override
	public void cry() {
		
		System.out.println(name+"看见陌生的人会叫");
		// TODO Auto-generated method stub
		
	}
	
	
	

}
