package com.sxl;

public class Test03 {

	public static void main(String[] args) {
		// 个位数为6且能被3整除的五位数共有多少
		int sum = 0;
		for (int i = 10000; i < 99999; i++) {
			if ((i % 10 == 6) && (i % 3 == 0)) {
				sum++;
			}

		}
		System.out.println(sum);

	}
}
