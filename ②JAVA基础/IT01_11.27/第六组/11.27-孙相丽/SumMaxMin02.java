package com.sxl;

import java.util.Arrays;

public class SumMaxMin02 {
	// 2 定义一个整型数组{5,9,12,45,18,30}，
	// 要求打印出数组中所有元素之和，
	// 并打印出最大值和最小值。

	public static void main(String[] args) {
		int[] a = { 5, 9, 12, 45, 18, 30 };
		// 初始化和，最大值和最小值的的变量
		int sum = 0;
		int max = a[0];
		int min = a[0];
		//for循环求和与if判断最大值和最小值
		for (int i = 0; i < a.length; i++) {
			if (max > a[i]) {
				max = a[i];
			}
			if (min < a[i]) {
				min = a[i];
			}
			sum += a[i];
		}
		System.out.println("所求元素和：" + sum);
		System.out.println("元素的最大值：" + max);
		System.out.println("元素的最小值：" + min);

	}
}
