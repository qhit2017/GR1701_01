package com.sxl;

public abstract class Person {
   //成员变量
	String name;
	int age;
	 //构造方法
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public  abstract  String getContent( String character);
		String say(){
			
		System.out.println(this.getContent(name));
		return name;
	}
	
	
	
}
