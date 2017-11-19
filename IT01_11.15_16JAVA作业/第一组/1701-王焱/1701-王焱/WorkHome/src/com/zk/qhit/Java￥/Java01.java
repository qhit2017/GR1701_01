package com.zk.qhit.Java￥;

import java.util.Scanner;


public class Java01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数字：");

		int i = sc.nextInt();
		
		if (i > 0) {
			System.out.println("该数是正数。");
		} else {
			System.out.println("该数是负数。");
		}

	}
}
