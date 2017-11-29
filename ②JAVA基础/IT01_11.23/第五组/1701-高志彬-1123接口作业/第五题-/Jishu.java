package com.Job05;

public class Jishu {
	public static void main(String[] args) {
		// 5 用for 和 while两种方法计算1~100之间奇数的和
		System.out.println("for循环实现：");
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {

			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
