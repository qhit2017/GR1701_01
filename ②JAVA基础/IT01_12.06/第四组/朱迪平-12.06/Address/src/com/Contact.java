package com;
/** 
 * @author  作者 E-mail:271406@163.com
 * @date    创建时间：2017年12月6日 上午8:33:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Contact {
	private String name;
	private String sex;
	private String telNum;
	
	public Contact() {
		super();
	}

	public Contact(String name, String sex, String telNum) {
		super();
		this.name = name;
		this.sex = sex;
		this.telNum = telNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", sex=" + sex + ", telNum=" + telNum
				+ "]";
	}

}



