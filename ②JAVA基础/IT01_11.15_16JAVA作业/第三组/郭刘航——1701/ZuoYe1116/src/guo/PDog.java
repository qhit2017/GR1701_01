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
public class PDog {
	//警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速，
		String breed;
		double weight;
		int age;
		String eyescolor;
		int legs;
		int speed;
		
		public void message(){
			System.out.println("我是一名警犬，品种是"+breed+
					           "重"+weight+"磅，我已经"+age+
					           "岁了，我眼睛的颜色是"+eyescolor+
					           "，有"+legs+"条腿，最高速度是"+speed+"km/h");
		}
		
		//调用它的吃的方法和work方法
		public void eat(){
			System.out.println("我向来不挑食！！！！");
		}
		public void work(){
			System.out.println("我会在主人最需要时挺身而出，即使面对的是死亡！！！！！！！！！");
		}


}
