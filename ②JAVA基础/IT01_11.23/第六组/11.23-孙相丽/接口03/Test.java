package com.sxl;

public class Test {

	public static void main(String[] args) {
		//狗和老鼠的申明且实例化
		Dog   d=  new Dog();
		Mouse m=  new Mouse();
		//给狗和老鼠对象名属性赋值，调用叫和吃的方法
	
		d.color="白色";
		d.name="jack";
		d.variety="泰迪";
		System.out.println("狗的年龄："+d.getAge());
		System.out.println("狗的名字叫："+d.name
				+"它是:"+d.color+"的"
				+"他的品种是："+d.variety);
		d.eat();
		d.voice();
		m.legs=4;
		m.name="小白";
		m.variety="仓鼠";
		System.out.println("鼠的名字叫："+m.name
				+"它有:"+m.legs+"腿"
				+"他的品种是："+m.variety);
		System.out.println("仓鼠的体重是："+m.getWeight());
		m.eat();
		m.voice();
		
	}
	
	
	
}
