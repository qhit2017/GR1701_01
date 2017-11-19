package com;

import java.util.Scanner;

public class Ball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入k为多少");
		double h = sc.nextInt();
		double hs = k / 2;
		int j = 0;
		System.out.println("请输入n为多少");
		int n = sc.nextInt();
		for (j = 2; j < n; j++) {
			k = k +ks * 2;
			ks = ks / 2;

		}
		System.out.println("第" + j + "次落地经过" + k + "米");
		System.out.println("第" + j + "次反弹" + ks + "米");

	}

}
