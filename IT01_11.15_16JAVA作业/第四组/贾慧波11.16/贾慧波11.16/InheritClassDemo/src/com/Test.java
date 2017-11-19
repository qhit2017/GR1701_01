package com;
/** 
 * @author  作者 E-mail:271406@163.com
 * @date    创建时间：2017年11月16日 下午3:14:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {public static void main(String[] args) {
	
	Cat cat=new Cat("藏獒",2,"黑",23.5f,4);
	cat.age=3;
	System.out.println("三岁");
	cat.eat("fish");
	cat.play();
	
	System.out.println("吃");
	cat.catchmouse();
	cat.setBreed("拉布拉多");
	System.out.println(cat.getBreed());
}

}
