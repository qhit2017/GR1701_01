/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月13日 下午7:51:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package cc;

import java.util.Scanner;

public class Disiti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=0.5;
		double g = 0;
		System.out.println("输入落地次数：");
		double b=sc.nextDouble();
		for (int i = 1; i <b; i++) {
			g =g+2*100*a;
			a=a*0.5;
		}
		System.out.println(100+g);
	}

}
