package com.gaojie.qhit01;

import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月18日 上午11:03:50
 */
public class Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数判断正负\n");
		int i = sc.nextInt();
		
		if (i > 0) {
			System.out.println(i + "为正数");
		}
		if (i == 0) {
			System.out.println(i + "既不是正数也不是负数");
		}
		if (i < 0) {
			System.out.println(i + "为负数");
		}

	}

}
