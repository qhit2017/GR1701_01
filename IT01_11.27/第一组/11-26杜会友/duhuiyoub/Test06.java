package com;


public class Test06 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 8; a <= 1000; a++) {
			if (a % 8 == 0) {
				sum++;
			}
		}
		System.out.println("8的倍数有"+sum+"个");
	}
}
