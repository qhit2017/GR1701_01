
public class Test {
	
	/*
	 * d.创建测试类，分别创建狗和老鼠的实例化对象，给对象的属性赋值，并且调用对象的吃、叫的方法
	 */
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
