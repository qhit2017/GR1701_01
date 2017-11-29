package com.zk.qhit;

import java.util.Scanner;

/**
 * time:11.16 week:Thursday weather:sun author:sun site:machine room
 */
public class MaxTest {
	public static void main(String[] args) {

		/**
		 * 6 从键盘输入4个整数，编写程序实现对这4 个整数从大到小的顺序排列输出。 a b a c a d b c b d c d
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数a");
		int a = sc.nextInt();
		System.out.println("请输入数b");
		int b = sc.nextInt();
		System.out.println("请输入数c");
		int c = sc.nextInt();
		System.out.println("请输入数d");
		int d = sc.nextInt();
		int i;
		if (a < b) {
			i = a;
			a = b;
			b = i;
		}
		if (a < c) {
			i = a;
			a = c;
			c = i;
		}
		if (a < d) {
			i = a;
			a = d;
			d = i;
		}
		if (b < c) {
			i = b;
			b = c;
			c = i;
		}
		if (b < d) {
			i = b;
			b = d;
			d = i;
		}
		if (c < d) {
			i = c;
			c = d;
			d = i;
		}
		System.out.println("四个数c从大到小的顺序为：" + a + "" + b + "" + c + "" + d);
		sc.close();
	}

}
