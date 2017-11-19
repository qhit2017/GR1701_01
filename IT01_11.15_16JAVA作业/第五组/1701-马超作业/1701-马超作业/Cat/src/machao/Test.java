package machao;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月17日 下午3:49:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat("Tom","白色", 21);

		cat.setColor("白色");
		cat.name = "Tom";
		cat.weight = 21;

		cat.eyescolor = "绿色";

		cat.shuxing();
		cat.eat("鱼");
		cat.run();
		cat.sleep();

		cat.play();
		cat.catchmouse();
	}
}

