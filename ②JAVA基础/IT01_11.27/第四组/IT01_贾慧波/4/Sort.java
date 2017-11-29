package com.jhb;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		int[] a = { 2, 8, 69, 45, 21, 12, 35, 68, 47, 37 };

		for (int i = 0; i < a.length - 1; i++) {

			int temp;

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[j];

					a[j] = a[j + 1];

					a[j + 1] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
