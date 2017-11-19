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
public class PDogText {
	public static void main(String[] args) {
		PDog dog = new PDog();
		dog.breed = "拉布拉多";
		dog.weight = 70;
		dog.age = 4;
		dog.eyescolor = "棕黄色";
		dog.legs = 4;
		dog.speed = 20;
		
		System.out.println("我是一名警犬，");
		dog.message();
		System.out.println();
		dog.eat();
		System.out.println();
		dog.work();
	}

}
