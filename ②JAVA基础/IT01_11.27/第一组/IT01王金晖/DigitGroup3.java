package com.wjh;

import java.util.Arrays;
import java.util.Scanner;

public class DigitGroup3 {

	public static void main(String[] args) {
		// 从键盘输入10个数，输出后5个数
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (i < 5) {
				continue;
			}
			System.out.print("您输入的后5个数字是："+a[i]+"  ");
		}
		System.out.print("您输入的数字是：");
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
