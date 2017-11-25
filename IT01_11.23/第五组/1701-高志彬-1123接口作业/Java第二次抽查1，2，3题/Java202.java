package com.Job01;

import java.util.Scanner;

public class Java202 {
	// 2.编写JAVA程序，输入一个三位数，输出该数的十位是多少；
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int i = sc.nextInt();

		int shi;
		shi = i % 100 / 10;
		System.out.println("该三位数的十位上的数字是：");
		System.out.println(shi);

	}

}
