package com.zk.qhit.statictest;

import java.util.Scanner;

public class Wholecount {
	public static void main(String[] args) {
		Scanner scon = new Scanner(System.in);
		System.out.println("输入一个五位数");
		
		int a = scon.nextInt();
		
		if (a / 10000 == a % 10 || a / 1000 % 10 == a % 100) {
			
			System.out.println("是回文数");
			
		} else

			System.out.println("不是回文数");

	}
}
