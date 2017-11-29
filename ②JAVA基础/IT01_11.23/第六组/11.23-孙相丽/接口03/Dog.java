package com.sxl;

public class Dog implements A {
     String name;
	
     String variety;
     private  int age;	
     String color;	
	
     
     
     
	/**
	 * 
	 */
	public Dog() {
		
	}

	/**
	 * @param name
	 */
	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void voice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}
     //·â×°
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
