package com.jkl;

public class Test {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setName("马超");
		dog.setBreed("拉布拉多犬");
		dog.setColor("灰色");
		dog.setAge(19);
		System.out.println(dog.toString());
		dog.eat();
		dog.shout();
		
		
		Mouse mouse=new Mouse();
		mouse.setName("杰克");
		mouse.setBreed("土拨鼠");
		mouse.setLegs(4);
		mouse.setWeight(2.5);
		System.out.println(mouse.toString());
		mouse.eat();
		mouse.shout();
	}
}
