package com.gaojie.qhit01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月27日 下午3:00:34
 */
public class Traverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数：");
			a[i] = sc.nextInt();
		}
		
			System.out.println(Arrays.toString(a));
		

		sc.close();
	}

}
