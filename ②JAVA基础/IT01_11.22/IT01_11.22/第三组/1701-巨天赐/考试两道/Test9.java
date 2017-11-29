package com.jtc.qhit01;

import java.util.Scanner;


public class Test9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个不大于10000的数N");

		int N = sc.nextInt();

		System.out.println("N范围内所有7的倍数和包含7的数如下");

		if (N > 10000) {
			System.out.println("超出范围");
		}

		else {
			for (int i = 1; i <= N; i++) {
				if (i % 7 == 0
						&& (i % 10 == 7 || i / 10 % 10 == 7
								|| i / 100 % 10 == 7 || i / 1000 == 7)) {
					System.out.println(i);
				}
			}

		}sc.close();
	}

}
