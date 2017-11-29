package com;


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
