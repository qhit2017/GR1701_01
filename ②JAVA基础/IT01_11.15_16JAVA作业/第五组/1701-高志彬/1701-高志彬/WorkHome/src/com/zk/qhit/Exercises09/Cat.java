package com.zk.qhit.Exercises09;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月16日 下午7:40:46
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Cat {
	
	
	
	
	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getEarstyle() {
		return Earstyle;
	}

	public void setEarstyle(String earstyle) {
		Earstyle = earstyle;
	}

	String eyeColor;
	// 耳朵样式，状态
	String Earstyle;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void CatchMouse() {
		System.out.println("我喜欢抓杰瑞。");
	}

	void playgames() {
		System.out.println("我喜欢杰瑞，喜欢跟它一起玩。");
	}

	public void eat(String food) {
		// super.eat(food);
		System.out.println("我喜欢吃猫粮！");
	}
	

}
