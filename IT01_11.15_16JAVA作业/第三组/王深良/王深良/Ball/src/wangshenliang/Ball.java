package wangshenliang;

import java.util.Scanner;

/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月16日 下午1:50:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Ball {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入a为多少");
		double a = sc.nextInt();
		double h = a / 2;  
		
		int i = 0;
		System.out.println("请输入b为多少");
		int b= sc.nextInt();
		for (i = 1;i< b;i ++){
		a = a + h * 2;   
		h = h / 2;       
		}
		System.out.println("第" + i + "次落地经过" + a +"米"); 
		System.out.println("第" + i + "次反弹" + h + "米");
		}
		}
	


