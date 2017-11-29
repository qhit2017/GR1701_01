package wangshenliang;
/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月16日 下午7:16:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Dogtest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setBreed("雪佛兰");
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
	


