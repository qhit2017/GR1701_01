package com.jkl;

public class Diwuti02 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += (i % 2 != 0) ? i : 0;
		}
		System.out.println("1~100之间奇数的和为" + sum);
	}
}
