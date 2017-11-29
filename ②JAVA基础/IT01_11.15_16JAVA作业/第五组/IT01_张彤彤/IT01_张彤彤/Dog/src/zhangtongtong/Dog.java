package zhangtongtong;

public class Dog {

	// 属性包括：品种、颜色、年龄、重量，要求属性私有
	private String breed;
	private String color;
	private int age;
	private double wight;
	
	//get、set方法

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWight() {
		return wight;
	}

	public void setWight(double wight) {
		this.wight = wight;
	}

	// 方法包括：叫、吃、睡觉
	void shout() {
		System.out.println("叫");
	}

	void eat(String meat) {
		System.out.println("吃" + meat);
	}

	void sleep() {
		System.out.println("睡觉");

		System.out.println("品种:" + breed + "\n颜色:" + color + "\n年龄：" + age
				+ "\n体重:" + wight);
	}

}
