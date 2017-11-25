package whh;

/**
 * @author 作者 E-mail:2421922506@QQ.com
 * @date 创建时间：2017年11月23日 下午8:52:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {
	public static void testZoology(Zoology c) {
		c.getEat();
		c.getcall();
		
	}

	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.Dogs("大毛");
		testZoology(dog);

		Mouse mouse = new Mouse();
		mouse.Mouses("jack","sss");
		testZoology(mouse);	
			
			
		
		
		
	}

}
