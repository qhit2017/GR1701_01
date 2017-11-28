package com.saf;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// 从键盘输入10个数，并从大到小排序
		Scanner sc = new Scanner(System.in);
		int[] q = new int[10];

		for (int i = 0; i < q.length; i++) {

			System.out.println("请输入第" + (i + 1) + "个数");
			q[i] = sc.nextInt();
		}
		for (int i = 0; i < q.length - 1; i++) {
			int sum;
			if (q[i] > q[i + 1]) {
				sum = q[i];
				q[i] = q[i + 1];
				q[i + 1] = sum;

			}
		}
		System.out.println(Arrays.toString(q));
	}

}
