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
public class Dog extends Animals{
	
	
	public Dog(String color, double weight, String eyescolor, int legs) {
		super(color, weight, eyescolor, legs);
		// TODO Auto-generated constructor stub
	}
	

	String hobby;
	
	void play(){
		System.out.println("有时我会和主人玩飞盘，大部分时间是我在遛他！！！！！");
	}
	void run(){
		super.run();
		System.out.println("在我心中，只有奔跑，没有行走。");
	}

}
