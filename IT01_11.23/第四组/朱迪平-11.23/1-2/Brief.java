package com.xqw.port;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月22日 下午9:24:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Brief {

	public static void main(String[] args) {
		System.out.println("\t\t\t\t2017年11月22日作业\n");
		//第一题
		System.out.println("一、接口有什么好处？\n");
		System.out.println("1、做到设计与实现的分离；\n"
				+ "2、子类可以同时实现多个接口；\n"
				+ "3、子类同时共享多个接口中的常量，但必须实现所有抽象方法。\n");
		//第二题
		System.out.println("二、抽象类与接口有什么区别？\n");
		System.out.println("1、接口只包含全局变量和抽象方法；\n"
				+ "2、接口中的抽象方法可以省略abstract关键字，而抽象类中不可以省略；\n"
				+ "3、一个类只能继承一个父类，但可以实现多个接口；\n"
				+ "4、一个接口可以继承多个接口，但不能继承抽象类。");

	}

}
