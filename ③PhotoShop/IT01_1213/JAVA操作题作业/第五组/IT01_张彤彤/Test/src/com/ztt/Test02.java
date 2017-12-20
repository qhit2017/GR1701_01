package com.ztt;

import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年12月13日 下午7:51:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test02 {

	public static void main(String[] args) {
		
		//输入10-99之间的一个十进制整数，输出对应的十六进制数

		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入一个十进制的整数：");
		
		int a = sc.nextInt();
		
		if (a <= 99 && a>= 10) {
			
			String i = Integer.toString(a,16);
			
			System.out.println("转化为十六进制为：");
			
			System.out.println(i);
			
		} else {
			
			System.out.println("您输入的不在范围内");

		}

	}

}
