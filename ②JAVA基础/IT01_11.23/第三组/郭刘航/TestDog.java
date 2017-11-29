package glh;
/** 
 * @author  郭刘航
 * @作者 E-mail：1561061182@qq.com
 * @date    创建时间：2017年11月23日 下午7:59:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
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
