package com;

import java.util.Scanner;


public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数");
		int N = sc.nextInt();
		int sum = 0;
		int sun = 0;
		if (N > 0 && N <= 1000) {
			if (N % 2 != 0) {
				for (int a = 1; a < N; a++) {
					if (a % 2 != 0) {
						sum += a;
					}
				}
				System.out.println("奇数和" + sum);
			} else if (N % 2 == 0) {
				for (int b = 1; b < N; b++) {
					if (b % 2 == 0) {
						sun += b;
					}
				}
				System.out.println("偶数和" + sun);
			}
		} else {
			System.out.println("输入有误");
		}
	}
}
