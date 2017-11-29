package com.duhuiyou;

public class Dog implements Animal {
	//实现动物这个接口。
	//要求狗具有的属性包括：姓名、品种、颜色、年龄（属性私有） 
	//并创建两种构造方法（1 无参构造方法 2 参数为姓名的构造方法）
	/*private String name;
	private String variety;
	private String colour;
	private String age;
	/**
	 * @param name
	 * @param variety
	 * @param colour
	 * @param age
	 */
	/*public Dog(String name, String variety, String colour, String age) {
		this.name = name;
		this.variety = variety;
		this.colour = colour;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", variety=" + variety + ", colour="
				+ colour + ", age=" + age + "]";
	}*/
	@Override
	public Animal eat() {
		System.out.println("狗粮");
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Animal cry() {
		System.out.println("汪汪");
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
