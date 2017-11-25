package com.Job03;

public class Dog implements IAnimal{
	
	// b.创建狗，实现动物这个接口。要求狗具有的属性包括：
	//姓名、品种、颜色、年龄（属性私有） ，
	// 并创建两种构造方法（1 无参构造方法 2 参数为姓名的构造方法）
	
	String name;
	//品种，
	String variety;
	String color;
	private int age;
	
	Dog(){
		System.out.println("狗：");
		
		
	}
	
	
	
	
	
	
	public Dog(String name) {
		super();
		this.name = name;
	}






	@Override
	public String getEat() {
		System.out.println("爱吃肉骨头");
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getWow() {
		System.out.println("汪汪~");
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
