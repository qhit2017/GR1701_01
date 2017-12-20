package com.jkl;

import java.util.Scanner;


public class Dierti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int a = sc.nextInt();
		System.out.println("该数的十位数是"+a/10%10);
	}
}
