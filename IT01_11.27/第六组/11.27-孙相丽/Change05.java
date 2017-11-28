package com.sxl;

import java.util.Scanner;

public class Change05 {
//5 从键盘输入10个数，将第2个与第6个交换，第4个与第8个交换，输出原来的10个数，以及交换后的10个数
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + "\t");

		}
		int i = a[1];
		a[1] = a[5];
		a[5] = i;

		int n = a[3];
		a[3] = a[7];
		a[7] = n;

		System.out.println();
		for (int h = 0; h< a.length; h++) {
			System.out.print(a[h] + " ");
		}

	}

}
