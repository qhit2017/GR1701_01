package com;

import java.util.Scanner;

/**
 * @author 作者 E-mail:271406@163.com
 * @date 创建时间：2017年11月20日 下午8:25:48
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Rank {
	public static void main(String[] args) {
		// 输入三个整数x,y,z，请把这三个数由小到大输出。
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个整数");
		int a = sc.nextInt();
		System.out.println("输入第二个整数");
		int b = sc.nextInt();
		System.out.println("输入第三个整数");
		int c = sc.nextInt();
		int s = 0;
		if (a > b) {
			s = a;
			a = b;
			b = s;
		}
		if (a > c) {
			s = a;
			a = c;
			c = s;

		}
		if (b > c) {
			s = b;
			b = c;
			c = s;
		}
		System.out.println("顺序为" + c + ">" + b + ">" + a);

	}

}
