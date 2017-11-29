package wangshenliang;

/**
 * @author 作者 王深良E-mail:793708547@QQ.com
 * @date 创建时间：2017年11月16日 下午7:13:55
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Dog {
	private String breed;
	private String color;
	private int age;
	private int weight;

	public void message() {
		System.out.println("品种是:" + breed + "，皮毛的颜色是：" + color + "，现在" + age
				+ "岁了" + ",重量是：" + weight + "磅。");
	}

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

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight <= 100) {
			this.weight = weight;
		}
	}

	public void bark() {
		System.out.println("叫");
	}

	public void eat() {
		System.out.println("吃");
	}

	public void sleep() {
		System.out.println("睡觉");

	}

}
