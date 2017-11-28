package com.wjh;

import java.util.Arrays;
import java.util.Scanner;

public class DigitGroup5 {

	// 从键盘输入10个数，将第2个与第6个交换，第4个与第8个交换，输出原来的10个数，
	// 以及交换后的10个数

	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			int b;
			a[i] = sc.nextInt();
			System.out.println(Arrays.toString(a));

			b = a[1];
			a[1] = a[5];
			a[5] = b;

			b = a[3];
			a[3] = a[7];
			a[7] = b;

		}
		System.out.println(Arrays.toString(a));
	}
}
