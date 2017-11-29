package machao;

import java.util.Scanner;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月17日 下午1:44:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Decimals {
    public static void main(String[] args) {
    	//编写JAVA程序，通过控制台输入一个数字，判断两个小数大小，
    	//并输出判断结果
    	Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数s:");
		float s = sc.nextFloat();
		System.out.println("请输入第二个数f:");
		float f = sc.nextFloat();

		System.out.println((s > f) ? "s>f" : (s == f) ? "s=f" : "s<f");

		sc.close();
	}
}	
		

		
	


	

