package com.zk.qhit.Java￥;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月16日 下午7:35:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Java01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数字：");

		int i = sc.nextInt();
		
		if (i > 0) {
			System.out.println("该数是正数。");
		} else {
			System.out.println("该数是负数。");
		}

	}
}
