package com.qhit;

public class Test4 {

	public static void main(String[] args) {

		double h = 100;

		double sum = 0;
		for (int i = 1; i < 10; i++) {

			h = h / 2;
			sum += h * 2;
		}
		System.out.println(h);
		System.out.println(sum + 100);
	}
}
