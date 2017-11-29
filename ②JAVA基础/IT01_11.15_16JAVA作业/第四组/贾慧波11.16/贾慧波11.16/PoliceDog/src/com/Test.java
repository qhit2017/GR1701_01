package com;

//创建一个测试类，实例化一个警犬对象，设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速，
//调用它的吃的方法和work方法
public class Test {
	public static void main(String[] args) {
		PoliceDog policedog = new PoliceDog();
		policedog.breed = "拉布拉多";
		policedog.colour = "白色";
		policedog.weight = 23.5f;
		policedog.age = 3;
		policedog.eyecolour = "red";
		policedog.legnumber = 2;
		policedog.speed = 3.25f;

		policedog.eat();
		policedog.work();
		policedog.info();
	}

}
