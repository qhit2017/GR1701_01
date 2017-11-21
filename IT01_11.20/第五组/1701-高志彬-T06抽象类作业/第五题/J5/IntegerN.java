package com.zk.qhit.J5;

import java.util.Scanner;

public class IntegerN {
	// 9.编写JAVA程序，通过控制台输入一个整数N，（N不大于10000），输出所有7的倍数和包含7的数字。
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入N(N<10000)：");

		int N = sc.nextInt();
		System.out.println("N范围内所有7的倍数和包含7的数字：");

		if (N < 10000) {
			for (int i = 1; i <= N; i++) {
				if (i % 7 == 0
						&& ((i % 10 == 7) || (i / 10 % 10 == 7)
								|| (i / 100 % 10 == 7) || (i / 10000 == 7))) {
					System.out.println(i);

				}

			}
			if (N >= 10000 || N <= 0) {
				System.out.println("不合题意。");
			}
		}

	}

}
