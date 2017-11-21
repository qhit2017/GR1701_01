package com.qhit.Work;

public class Quzi8 {

	public static void main(String[] args) {
		int x = 0;
		for (int a = 100; a <= 1000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				System.out.println("个位为6且整除3的数有:" + a);
				x++;
			}
		}
		System.out.println("共有" + x + "个");
	}
}
