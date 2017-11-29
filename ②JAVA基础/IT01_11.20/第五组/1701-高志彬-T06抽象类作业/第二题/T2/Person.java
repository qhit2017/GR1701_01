package com.zk.qhit.T2;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月20日 下午8:44:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Person {
	//2、创建抽象类Person，
	//并定义抽象方法getContent()返回值是字符串，
	//额外定义say方法调用getContent（）方法并输出；
	//子类Sudent、Workder继承Person类；
	//并实现抽象类的方法getContent；
	//实例化对象并分别调用say（）方法 。
	//public abstract String getContent();
	String Content;
	
	public abstract String getContent();
	
	void say(){
		System.out.println(getContent());
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
