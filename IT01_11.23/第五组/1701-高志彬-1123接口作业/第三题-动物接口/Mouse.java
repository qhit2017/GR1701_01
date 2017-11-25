package com.Job03;

public class Mouse implements IAnimal{
	
	
	// c.创建老鼠 实现动物这个接口。要求老鼠具有的属性包括：
	//姓名、品种、几条腿、体重（属性私有） ，
	//并创建两种构造方法（1 无参构造方法 2 参数为姓名、品种的构造方法）
	
	String name;
	String breed;
	int leg;
	private double weight;
	
	Mouse(){
		System.out.println("一只米老鼠~");
	}
	
	
	
	

	public Mouse(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}





	@Override
	public String getEat() {
		System.out.println("我爱吃大米");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWow() {
		System.out.println("吱吱吱~");
		// TODO Auto-generated method stub
		return null;
	}


}
