package jtc;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月23日 下午7:29:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ChouKao_02 {

	public static void main(String[] args) {
		System.out.println("请输入一个三位数：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("该数的十位数是"+i / 10%10);
	}
}
