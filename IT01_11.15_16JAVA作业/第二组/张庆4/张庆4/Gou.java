package zhangqing;

public class Gou {
	String color;
	int age;
	int leg;
	String type;
	int speed;
	/**
	 * @param color
	 * @param age
	 * @param leg
	 * @param type
	 * @param speed
	 */
	
	public Gou(String color, int age, int leg, String type, int speed) {
		super();
		this.color = color;
		this.age = age;
		this.leg = leg;
		this.type = type;
		this.speed = speed;
		System.out.println("吃的方法:用嘴吃");
		
	}
	

	
	
	void xiaogou(){
		System.out.println("颜色:"+color+"\n年龄:"+age+"\n腿的数量:"+leg+"\n种类:"+type+"\n速度:"+speed);
	}

	
}