package com.zk.qhit;

import java.util.Scanner;

public class Judge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数i");
		int i = sc.nextInt();
		if (i > 0) {
			System.out.println(i + "是正数");
		} else if (i < 0) {
			System.out.println(i + "是负数");
		} else {
			System.out.println();
		}
		sc.close();
	}
}
