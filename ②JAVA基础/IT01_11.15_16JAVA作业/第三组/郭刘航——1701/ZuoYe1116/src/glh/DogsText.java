package glh;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class DogsText {
	public static void main(String[] args) {
		
		Dogs dog = new Dogs();
		dog.eyescolor = "棕色";
		dog.legs = 4;
		dog.setBreed("拉布拉多");
		dog.setColor("黄白相间");
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
