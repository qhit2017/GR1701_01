package com.gaojie.qhit01;

import java.util.Scanner;

import org.omg.IOP.MultipleComponentProfileHelper;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月22日 下午1:52:15
 */
public class Test9_2 {

	static boolean multiple = false;

	public static boolean isMultiple(int n, int m) {
		if (n % m == 0) {
			multiple = true;

		} else {
			multiple = false;
		}

		return multiple;
	}

	static boolean include = false;

	public static boolean isInclude(int q, int w) {
		int r = q;
		while (r > 0) {
			if (r % 10 == w) {
				include = true;
				break;

			} else {
				r = r / 10;
				include = false;
			}

		}

		return include;
	}

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
				if (isMultiple(i, 7) && isInclude(i, 7)) {
					System.out.println(i);
				}
			}

		}
		sc.close();
	}

}
