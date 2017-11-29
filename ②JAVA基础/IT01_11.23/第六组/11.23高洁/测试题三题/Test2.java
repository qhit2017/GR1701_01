package com.gj.qhit;

import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月23日 上午10:46:56
 */
public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int i = sc.nextInt();
		int a = 0;
		if (i > 99 && i < 1000) {
			a = i / 10 % 10;
			System.out.println(a);

		} else {
			System.out.println("请输入一个三位数");
		}

		sc.close();

	}
}