package com;

// 创建一个测试类，实例化一个警犬对象，设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速，
//调用它的吃的方法和work方法
public class PoliceDog {
	String breed;
	String colour;
	float weight;
	int age;
	String eyecolour;
	int legnumber;
	float speed;

	void eat() {
		System.out.println("警犬吃肉");
	}

	void work() {
		System.out.println("警犬会叫");
	}

	void info() {
		System.out.println("品种为：" + breed + "毛的颜色：" + colour + "重量" + weight
				+ "年龄" + age + "眼睛颜色" + eyecolour + "腿的数量" + legnumber + "最快时速"
				+ speed);

	}
}
