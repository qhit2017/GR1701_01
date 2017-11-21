package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月20日 下午10:16:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe1120_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个五位数：");
		int x = sc.nextInt();
		
		if (x % 10 == x / 10000&&x %10000/1000 == x % 100 / 10){
			System.out.println(x+"是一个回文数");
		}else{
			System.out.println(x+"不是回文数");
		}
	}
}
