package jtc;

public class TestDog {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("凯奇");
		dog.setBreed("拉布拉多");
		dog.setColor("黄白相间");
		System.out.println(dog.toString());
		dog.setAge(4);
		dog.shout();
		dog.eat();
	}
}
