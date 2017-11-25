package animal;
/*Author：刘龑聪
 *E-mail：15539919713@163.com
 */
public class Test {
	public static void main(String[] args) {
		//实例化对象：狗
		Dog dog = new Dog();
		dog.setName("拉布拉多");
		dog.setType("警犬");
		dog.setColor("黑色");
		dog.setAge(9);
		System.out.println(dog.toString());
		dog.eat();
		dog.shout();
		
		//实例化对象：老鼠
		Mouse mouse = new Mouse();
		mouse.setName("伊丽莎白鼠");
		mouse.setType("白鼠");
		mouse.setLegs(4);
		mouse.setWeight(1.5);
		System.out.println(mouse.toString());
		mouse.eat();
		mouse.shout();
		
	}
}
//创建测试类，分别创建狗和老鼠的实例化对象，给对象的属性赋值，并且调用对象的吃、叫的方法