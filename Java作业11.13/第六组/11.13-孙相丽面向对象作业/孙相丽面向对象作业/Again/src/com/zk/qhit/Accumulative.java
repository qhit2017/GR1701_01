package com.zk.qhit;

public class Accumulative {
	// 5、求整数1~100的累加值，但要求跳过个位为3的数
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 10 != 3) {
				sum += i;

			}
		}
		System.out.println("该题所求和为：" + sum);
	}
}
