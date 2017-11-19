package com;


public class Test {public static void main(String[] args) {
	
	Cat cat=new Cat("拉布拉多",2,"黄色",23.5f,4);
	cat.age=3;
	System.out.println("三岁");
	cat.eat("fish");
	cat.play();
	
	System.out.println("吃");
	cat.catchmouse();
	cat.setBreed("拉布拉多");
	System.out.println(cat.getBreed());
}

}
