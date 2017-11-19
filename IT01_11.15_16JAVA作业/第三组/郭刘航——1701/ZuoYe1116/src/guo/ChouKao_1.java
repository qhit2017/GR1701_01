package guo;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ChouKao_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("输入的数字是：");
		
		int a = sc.nextInt();
		if (a > 0){
			System.out.println("该数为正数。");
		}
		if (a < 0){
			System.out.println("该数为负数。");
		}
		
	}


}
