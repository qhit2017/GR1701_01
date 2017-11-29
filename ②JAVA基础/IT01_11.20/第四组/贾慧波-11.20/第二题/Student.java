package com;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月20日 下午8:13:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public  class Student extends Person1{

	public Student(String getContent) {
		super(getContent);
		// TODO Auto-generated constructor stub
	System.out.println("hello");
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void say() {System.out.println("nihao");
		// TODO Auto-generated method stub
		
	}

}
