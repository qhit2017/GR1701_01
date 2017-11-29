package com.jhb;

public class MaxMin {

	public static void main(String[] args) {

		int[] a = { 5, 9, 12, 45, 18, 30 };

		int Max = a[0];

		int Min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > Max) {

				Max = a[i];
			}

			if (a[i] < Min) {

				Max = a[i];
			}
		}

		System.out.println("最大值是：\n" + Max);

		System.out.println("最小值是：\n" + Min);

	}

}
