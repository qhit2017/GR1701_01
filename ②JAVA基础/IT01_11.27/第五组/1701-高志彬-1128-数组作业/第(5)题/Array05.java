package com.gzz.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月27日 下午7:42:24
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Array05 {
	// 5 从键盘输入10个数，将第2个与第6个交换，
	// 第4个与第8个交换，输出原来的10个数，以及交换后的10个数
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Scanner类
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			// for循环接收int型数据
			System.out.print("输入第" + (i + 1) + "个:");
			a[i] = in.nextInt();
		}
		System.out.println(" ");
		System.out.println("原来的数组：" + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]= " + a[i]);
		}
		System.out.println(" ");
		// 交换:
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp;
				if (a[i] != a[j]) {
					temp = a[1];
					a[1] = a[5];
					a[5] = temp;
				}
				if (a[i] != a[j]) {
					temp = a[3];
					a[3] = a[7];
					a[7] = temp;
				}
			}
		}
		System.out.println("交换后的数组" + Arrays.toString(a));

	}

}
