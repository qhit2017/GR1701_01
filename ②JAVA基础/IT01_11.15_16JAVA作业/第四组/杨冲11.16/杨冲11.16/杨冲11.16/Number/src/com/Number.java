package com;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:271406@163.com
 * @date    创建时间：2017年11月16日 下午7:27:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Number {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个数字");
	int i=sc.nextInt();
	
	if(i>0){
		System.out.println("正数"+i);
	}
	if(i<0){
		System.out.println("负数"+i);
	}
	
	
}

}
