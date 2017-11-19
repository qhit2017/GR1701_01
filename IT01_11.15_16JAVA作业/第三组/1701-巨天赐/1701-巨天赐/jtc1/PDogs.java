package jtc;
/** 
 * @author  作者:jtc
 * @date    创建时间：2017年11月16日 下午5:52:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PDogs {

	//设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速，
	String breed;
    String color;
	int weight;
	int age;
	String eyescolor;
	int legs;
	int speed;
	
	void message(){
		System.out.println("我是一条警犬，我的品种是"+breed+
				           "，身体的颜色是"+color+
				           "，体重是"+weight+
				           "磅，我已经"+age+
				           "岁了，我眼睛的颜色是"+eyescolor+
				           "，我有"+legs+"条腿，最高速度是"+speed+"km/h");
	}
	//它的吃的方法和work方法
	public void eat(){
		System.out.println("我吃的很有营养，享受好的待遇。");
	}
	public void work(){
		System.out.println("我会跟随主人，在主人最需要帮助时提供帮助！！！！");
}
}