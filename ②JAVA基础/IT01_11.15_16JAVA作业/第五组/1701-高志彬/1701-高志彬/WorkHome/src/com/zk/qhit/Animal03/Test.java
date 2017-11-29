package com.zk.qhit.Animal03;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月16日 下午7:17:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.leg=4;
		dog.eyecolor="黑色";
		dog.age=3;
		System.out.println("它"+dog.age+"岁了 ，");
		System.out.println("它的腿的数量是："+dog.leg);
		System.out.println("它的眼睛是："+dog.eyecolor);
		
		
	}
	
	
    
}
