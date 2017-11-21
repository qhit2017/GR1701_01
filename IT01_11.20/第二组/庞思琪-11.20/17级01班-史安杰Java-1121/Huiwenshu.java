package com.zk.qhit.statictest;

import java.util.Scanner;

public class Huiwenshu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个五位数：");
		int x = sc.nextInt();

		if (x % 10 == x / 10000 && x % 10000 / 1000 == x % 100 / 10) {
			System.out.println(x + "是回文数");
		} else {
			System.out.println(x + "不是回文数");
		}
	}

}
