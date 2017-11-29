package com.zk.qhit.PoliceDogs02;

public class PoliceDogs02 {
	//2  创建一个测试类，实例化一个警犬对象，
	//设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速，
	
	String name; //，名字
	String breed; //品种，
	String color;//颜色，
	String eyecolor;
	int age;//年龄，
	double weight;//体重。
	int leg;
	String speed;
	
	
	
	public void bow_wow(){
		System.out.println("叫");
	}
	public void eat(){
		System.out.println("警犬每天吃肉.");}
	public void sleep(){
		System.out.println("睡觉");
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;			
	}
	
	public String getBreed(){
		return breed;
	}
	public void setBreed(String breed){
		this.breed = breed;			
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		if (color.equals("红色")){
			System.out.println("您的狗是个有个性的狗");
		}else{
		this.color = color;
		}			
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age =age;			
	}
	
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight = weight;			
	}

}
