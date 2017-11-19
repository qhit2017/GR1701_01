package JTC;
/** 
 * @author  作者:jtc
 * @date    创建时间：2017年11月16日 下午5:46:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Text {
public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setBreed("拉布拉多");
		dog.setColor("yellow");
		dog.setAge(4);
	    dog.setWeight(70);
	    System.out.println();
	    dog.message();
	    System.out.println("叫");
	    dog.bark();
	    System.out.println("吃");
	    dog.eat();
	    System.out.println("睡");
	    dog.sleep();
}
}