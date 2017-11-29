package com.qhit.Work;


public class Quzi4 {

	public static void main(String[] args) {
		int b = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 8 == 0) {
				b = b + a;
			}
		}
		System.out.println("八的倍数之和为:" + b);
	}
}
