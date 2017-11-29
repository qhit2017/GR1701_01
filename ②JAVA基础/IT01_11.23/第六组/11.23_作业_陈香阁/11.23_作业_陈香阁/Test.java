
public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("°¡»Æ");
		dog.setVariety("²Øéá");
		dog.setColour("Black and white");
		dog.setAge(5);
		System.out.println(dog.toString());
		Mouse mouse = new Mouse();
		
		mouse.setName("Ð¡°×");
		mouse.setBreed("Ð¡°×Êó");
		mouse.setLegs("4");
		mouse.setWeight(5);
		mouse.toString();
		System.out.println(mouse.toString());
		Animal.eat();
		Animal.wow();
	}

}
