package com.sxl;

import java.util.Scanner;

public class ArrayOutPut {
	// 3 从键盘输入10个数，输出后5个数
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] i = new int[10];
		for (int j= 0; j < i.length; j++) {
			System.out.println("请输入第" + (j+1) + "个数");
			i[j] = sc.nextInt();
		}
		for (int j = 5; j < i.length; j++) {
			System.out.println(i[j] + " ");

		}

		sc.close();
	}
}