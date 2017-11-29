package com;
/** 
 * @author  作者 E-mail:271406@163.com
 * @date    创建时间：2017年11月16日 下午3:13:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Cat extends Animal{

	public Cat(String breed, int age, String color, float weight, int leg) {
		super(breed, age, color, weight, leg);
		// TODO Auto-generated constructor stub
	}



	void play(){super.play();
		System.out.println("四处跑");
	}



void catchmouse(){System.out.println("你快到碗里来");}
void kind(){}
	
}
