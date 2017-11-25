package jtc;

public class TestMouse {

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.setLeg(4);
		mouse.setBreed("Ð¡°×Êó");
		mouse.setName("Jack");
		mouse.setWeight(20);
		System.out.println(mouse.toString());
		mouse.eat();
		mouse.shout();
	}
}
