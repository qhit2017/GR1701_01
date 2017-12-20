package com.qhit;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入10~99之间的一个十进制整数");
		int a = sc.nextInt();
		String str4 = Integer.toString(a, 16);
		System.out.println(str4);
	}
}
