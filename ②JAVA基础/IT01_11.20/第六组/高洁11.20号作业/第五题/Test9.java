package com.gaojie.qhit01;

import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月18日 下午1:02:59
 */
public class Test9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入N(N<10000)");
		int N = sc.nextInt();
		System.out.println("N范围内的所有7的倍数且包含七的数如下表示：");
		if (N < 10000) {
			for (int i = 1; i <= N; i++) {
				if ((i % 7 == 0)
						&& ((i % 10 == 7) || (i / 10 % 10 == 7)
								|| (i / 100 % 10 == 7) || (i / 10000 == 7))) {
					System.out.println(i);

				}

			}
		}
		if (N >= 10000 || N <= 0) {
			System.out.println("范围之外");
		}

	}
}
