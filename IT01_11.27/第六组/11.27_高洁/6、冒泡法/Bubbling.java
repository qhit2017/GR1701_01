package com.gaojie.qhit01;

import java.util.Arrays;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月27日 下午4:02:27
 */
public class Bubbling {
	public static void main(String[] args) {

		int[] a = { 22, 34, 15, 78, 11, 8 };

		int b = 0;

		for (int j = 0; j < a.length - 1; j++) {

			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] > a[i + 1]) {

					b = a[i];

					a[i] = a[i + 1];

					a[i + 1] = b;

				}

			}
			System.out.println(Arrays.toString(a));
		}
	}

}
