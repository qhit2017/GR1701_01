package com.duhuiyoua;

import java.util.Scanner;

//从键盘输入10个数，将第2个与第6个交换，
//第4个与第8个交换，输出原来的10个数，
//以及交换后的10个数
public class Fourthly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("输入第" + (i + 1) + "个数");
			a[i] = sc.nextInt();
			a[2] = a[6];
			a[4] = a[8];

		}
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);
		System.out.println(a[8]);
		System.out.println(a[9]);
		System.out.println(a[10]);
	}

}
