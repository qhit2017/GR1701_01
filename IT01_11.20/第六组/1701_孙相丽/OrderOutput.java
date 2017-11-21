package com.zk.qhit;

import java.util.Scanner;

public class OrderOutput {

	public static void main(String[] args) {
		// 输入三个整数x,y,z，请把这三个数由小到大输出。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入x=");
		int x = sc.nextInt();

		System.out.println("请输入b=");
		int y = sc.nextInt();

		System.out.println("请输入c=");
		int z = sc.nextInt();
		int c;

		if (x < y) {
			c = x;
			x = y;
			y = c;
		}
		if (x < z) {
			c = x;
			x = z;
			z = c;
		}
		if (y < z) {
			c = y;
			y = z;
			z = c;
		}
		System.out.println(从小到大顺序输出：" + z + "\t"
				+ y + "\t" + x);

		sc.close();
	}

}
