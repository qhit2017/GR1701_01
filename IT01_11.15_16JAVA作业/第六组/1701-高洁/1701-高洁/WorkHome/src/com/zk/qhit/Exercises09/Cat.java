package com.zk.qhit.Exercises09;


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
	// ¶ú¶äÑùÊ½£¬×´Ì¬
	String Earstyle;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void CatchMouse() {
		System.out.println("ÎÒÏ²»¶×¥½ÜÈğ¡£");
	}

	void playgames() {
		System.out.println("ÎÒÏ²»¶½ÜÈğ£¬Ï²»¶¸úËüÒ»ÆğÍæ¡£");
	}

	public void eat(String food) {
		// super.eat(food);
		System.out.println("ÎÒÏ²»¶³ÔÃ¨Á¸£¡");
	}
	

}
