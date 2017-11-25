package com.gzz1;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月22日 下午8:41:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Person {
	
	
	
	String content="work";
	
	
	public  abstract String getContent();
	
	void say (    ){
		System.out.println(getClass());
	}
	
	
	
	
}
