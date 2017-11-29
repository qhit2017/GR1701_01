package com.zk.qhit.statictest;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("输入第一个整数");
	int a = sc.nextInt();
	System.out.println("输入第二个整数");
	int b = sc.nextInt();
	System.out.println("输入第三个整数");
	int c = sc.nextInt();
	int s = 0;
	if (a > b) {
		s = a;
		a = b;
		b = s;
	}
	if (a > c) {
		s = a;
		a = c;
		c = s;

	}
	if (b > c) {
		s = b;
		b = c;
		c = s;
	}
	System.out.println( c + ">" + b + ">" + a);

}
}

