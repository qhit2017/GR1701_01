package guo;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Animals {

	String color;
	double weight;
	private String eyescolor;
	int legs;
	
	public Animals(String color, double weight, String eyescolor, int legs) {
		super();
		this.color = color;
		this.weight = weight;
		this.eyescolor = eyescolor;
		this.legs = legs;
	}
	
	public String getEyescolor() {
		return eyescolor;
	}
	public void setEyescolor(String eyescolor) {
		this.eyescolor = eyescolor;
	}
	
	public void message(){
		System.out.println("我的毛色是"+color+
				           "，体重"+weight+
				           "磅，眼睛颜色是"+eyescolor+
				           "，有"+legs+"条腿。");
	}
	
	void eat(String food){
		System.out.println("我最喜欢吃"+food);
	}
	void run(){
		System.out.println("我健步如飞！！！");
	}
	void sleep(){
		System.out.println("是我最享受的事！！！！！！！！！");
	}
}
