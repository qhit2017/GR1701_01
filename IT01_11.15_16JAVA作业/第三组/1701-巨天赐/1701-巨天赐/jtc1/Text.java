package jtc;
/** 
 * @author  作者:jtc
 * @date    创建时间：2017年11月16日 下午5:53:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Text {
	public static void main(String[] args) {
		PDogs pdog = new PDogs();
		pdog.breed = "拉布拉多";
		pdog.color = "黄白相间";
		pdog.weight = 70;
		pdog.age = 3;
		pdog.eyescolor = "棕黑色";
		pdog.legs = 4;
		pdog.speed = 20;
		
		pdog.message();
		System.out.println();
		pdog.eat();
		System.out.println();
		pdog.work();
}
}