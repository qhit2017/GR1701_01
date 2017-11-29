package wangshenliang;
/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月16日 下午7:19:10 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class ADogtest {
	public static void main(String[] args) {
		ADog dog = new ADog();
		dog.breed = "萨摩耶";
		dog.color = "黄白相间";
		dog.weight = 70;
		dog.age = 3;
		dog.eyescolor = "蓝色";
		dog.legs = 4;
		dog.speed = 20;
		
		dog.message();
		System.out.println();
		dog.eat();
		System.out.println();
		dog.work();
	}

}


