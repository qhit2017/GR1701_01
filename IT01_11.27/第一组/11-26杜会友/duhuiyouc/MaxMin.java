package com.saf;

public class MaxMin {
	// 定义一个整型数组{5,9,12,45,18,30}，
	// 要求打印出数组中所有元素之和，并打印出最大值和最小值。
	public static void main(String[] args) {
		int[] a = { 5, 9, 12, 45, 18, 30 };
		int max = a[0], min = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("最大值="+max);
		System.out.println("最小值="+min);
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("数组和="+sum);

	}

}
