package PoliceDogs;

import Animal.Dog;

public class Jingquan {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.leg=4;
		dog.eyecolor="黑色";
		dog.age=3;
		System.out.println("它"+dog.age+"岁了 ，");
		System.out.println("它的腿的数量是："+dog.leg);
		System.out.println("它的眼睛是："+dog.eyecolor);
		
		
	}

	public String breed;
	public String color;
	public int age;
	public String eyeColor;
	public int leg;
	public int weight;
	public String speed;
}
