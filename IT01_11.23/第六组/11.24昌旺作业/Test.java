
public class Test {
	
	
	public static void main(String[] args) {
		
		Dog dog = new Dog("大猫");
		dog.setAge(23);
		dog.setBreed("2哈");
		dog.setColor("黄色");
		dog.eat();
		dog.shout();
		
		
		Mouse m = new Mouse("杰克","小老鼠");
		m.setLegs(4);
		m.setWeight(6);
		m.eat();
		m.shout();
	}

}
