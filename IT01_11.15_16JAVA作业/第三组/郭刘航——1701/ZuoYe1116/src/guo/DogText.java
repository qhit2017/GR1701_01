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
public class DogText {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog("黄白相间",70,"棕色",4);
		/*
		dog.color = "黄白相间";
		System.out.println(dog.color);
		dog.setEyescolor("棕色");
		System.out.println(dog.getEyescolor());
		dog.legs = 4;
		dog.weight = 70;
		dog.hobby ="替主人拿报纸";
		*/
		dog.message();
		dog.eat("bone");
		dog.run();
		dog.sleep();
		dog.play();
	}

}
