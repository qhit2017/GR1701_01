package com.zk.qhit;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个小数i:");
		double i = sc.nextDouble();
		System.out.println("请输入第一个小数j:");
		double j = sc.nextDouble();
		if (i > j) {
			System.out.println("俩个小数的判断的结果为：" + i + ">" + j);
		} else if (i < j) {
			System.out.println("俩个小数的判断的结果为：" + i + "<" + j);
		} else {
			System.out.println("俩个小数的判断的结果为：" + i + "=" + j);
		}
		sc.close();
	}
}
