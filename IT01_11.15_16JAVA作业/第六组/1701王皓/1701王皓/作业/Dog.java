package dog;

public class Dog extends Zoology {

	private String breed;
	private String color;
	private int age;
	private int weight;

	public void message() {
		System.out.println("品种是:" + breed + "，颜色是：" + color + "，现在" + age + "岁"
				+ ",重量是：" + weight + "磅");
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
		System.out.println("如果有陌生人来，才会叫");
	}

	public void eat() {
		System.out.println("就喜欢吃骨头");
	}

	public void sleep() {
		System.out.println("有好的睡眠，才有好的工作");
	}
}
