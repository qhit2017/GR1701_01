package com;

public class Test {public static void main(String[] args) {
	Dog dog=new Dog();
	dog.setBreed("拉布拉多");
	dog.setAge(2);
	dog.setColor("yellow");
	dog.setName("tom");
	System.out.println(dog.getEat());
	System.out.println(dog.getShout());
	Mouse mouse=new Mouse();
	mouse.setBreed("白老鼠");
	mouse.setLegs(2);
	mouse.setName("jin");
	mouse.setWeight(36.2);
	System.out.println(mouse.getEat());
	System.out.println(mouse.getShout());
}

}
