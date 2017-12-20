package com.gaojie.qhit01;

import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月18日 上午11:29:54
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入两个小数用来判断大小");
		
		float i = sc.nextFloat();
		float g = sc.nextFloat();
		
		if (i < g) {
			System.out.println(i + "<" + g);
		}
		
		if (i == g) {
			System.out.println(i + "=" + g);
		}
		
		if (i > g) {
			System.out.println(i + ">" + g);
		}

	}
}
