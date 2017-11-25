package com.jkl;

public class Diwuti01 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;

		while (i <= 100) {
			sum += (i % 2 != 0) ? i : 0;
			i++;
		}
		System.out.println("1~100之间奇数的和为" + sum);
	}
}
