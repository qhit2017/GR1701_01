package com.zk.qhit.T4;

import java.util.Scanner;

public class PalindromicNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个五位数：");

		int i = sc.nextInt();
		/*
		 * i=abcde; a=i/10000; b=i/1000%10; c=i/100%10; d=i/10%10; e=i%10; a==e
		 * && b==d
		 */
		if (i / 10000 == i % 10 && i / 1000 % 10 == i / 10 % 10) {
			System.out.println("该数是回文数。");
		} else {
			System.out.println("该数不是回文数。");
		}

	}

}
