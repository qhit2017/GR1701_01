package wangshenliang;
/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月16日 下午7:18:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class ADog {
	String breed;
    String color;
	int weight;
	int age;
	String eyescolor;
	int legs;
	int speed;
	
	void message(){
		System.out.println("品种是"+breed+
				           "，身体的颜色是"+color+
				           "，体重是"+weight+
				           "磅，已经"+age+
				           "岁了，眼睛的颜色是"+eyescolor+
				           "有"+legs+"条腿，最高速度是"+speed+"km/h");
	}
	
	public void eat(){
		System.out.println("享受好的待遇");
	}
	public void work(){
		System.out.println("！！！！");
	}


}
