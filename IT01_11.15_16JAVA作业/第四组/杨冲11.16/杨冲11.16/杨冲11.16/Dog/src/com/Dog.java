package com;
/** 
 * @author  作者 E-mail:271406@163.com
 * @date    创建时间：2017年11月15日 下午7:45:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
// 定义一个类：狗，属性包括： 品种，毛的颜色， 年龄，重量  方法包括：叫、吃、睡觉
//要求属性私有，并提供get、set方法 
public class Dog {
	private String breed;
	private String colour;
	private int age;
	private float weight;
	
	void shouts(){System.out.println("叫");}
	void eat(){System.out.println("吃");}
	void sleep(){System.out.println("睡");}
	//get set方法
	public String getBreed(){
		return breed;}
	public void setBreed(String breed){this.breed=breed;}
	public String getColour(){
		return colour;}
	public void setColour(String breed){this.colour=colour;}
	public int getAge(){
		return age;}
	public void setAge(int age){this.age=age;}
	public float getWeight(){
		return weight;}
	public void setWeight(float weight){this.weight=weight;}
	
	
	
	
	
	
	

}
