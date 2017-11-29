package com.xiayuchen

import java.util.Arrays;

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
