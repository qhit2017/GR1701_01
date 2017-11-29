package glh;
/** 
 * @author  郭刘航
 * @作者 E-mail：1561061182@qq.com
 * @date    创建时间：2017年11月23日 下午8:27:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestMouse {

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.setLeg(4);
		mouse.setBreed("小白鼠");
		mouse.setName("Jack");
		mouse.setWeight(20);
		System.out.println(mouse.toString());
		mouse.eat();
		mouse.shout();
	}
}
