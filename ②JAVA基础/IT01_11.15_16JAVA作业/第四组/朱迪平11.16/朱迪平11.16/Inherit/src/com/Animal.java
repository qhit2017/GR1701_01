package com;
/** 
 * @author  作者 E-mail:271406@163.com
 * @date    创建时间：2017年11月16日 下午3:08:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Animal {
	private String breed;
	int age;
	String color;
	float weight;
	int leg;
	
	
	//Animal(){
	//	System.out.println("我是无参构造方法，我正在被调用");}
		
		
		
		
		
		
		
	//}
	public Animal(String breed, int age, String color, float weight, int leg) {
		super();
		this.breed = breed;
		this.age = age;
		this.color = color;
		this.weight = weight;
		this.leg = leg;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	void eat(String food){
		System.out.println("喜欢吃："+food);
	}
	void play(){
		System.out.println("玩");
	}
void sleep(){
	System.out.println("睡觉");
}
}
