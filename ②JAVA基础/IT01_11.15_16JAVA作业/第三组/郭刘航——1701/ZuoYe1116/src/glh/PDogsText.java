package glh;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PDogsText {
	public static void main(String[] args) {
		PDogs pdog = new PDogs();
		pdog.eyescolor = "棕褐色";
		pdog.legs = 4;
		pdog.setAge(4);
		pdog.setBreed("拉布拉多");
		pdog.setColor("黄白相间");
		pdog.setWeight(70);
		pdog.speed = 20;
		
		System.out.println("我是一名警犬，");
		pdog.message();
		System.out.println();
		pdog.speed();
		System.out.println();
		pdog.eat();
		System.out.println();
		pdog.work();
	}

}
