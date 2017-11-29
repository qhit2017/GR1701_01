package com.zk.qhit;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class Test {
	public static void main(String[] args) {
		
	
	/**创建一个测试类，实例化一个警犬对象，
	 * 设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、
	 * 最快时速，调用它的吃的方法和work方法
	 */
	PoliceDog dog = new PoliceDog();
	
	dog.setvariety("牧羊犬");
	System.out.println("警犬的品种："+dog.getvariety());
	
	dog.setcolor("灰色");
	System.out.println("警犬的毛的颜色："+dog.getcolor());
	
	dog.setweight(25);
	System.out.println("警犬的重量："+dog.getweight());
	
	dog.setage(6);
	System.out.println("警犬的年龄："+dog.getage());
	
	dog.eyecolor="褐色";
	System.out.println("警犬的眼睛的颜色："+dog.eyecolor);
	
	dog.legs=4;	
	System.out.println("警犬的腿的数量："+dog.legs);
	
	dog.fastestSpeed="40km/h";
	System.out.println("警犬的腿的数量："+dog.fastestSpeed);
	
	dog.eat();
	dog.work();
	
}
}