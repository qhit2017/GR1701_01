
package com;

import java.util.Scanner;


public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个三位数");
		int a = sc.nextInt();
		int b = a/10%10;
		System.out.println(b);

	}
}

