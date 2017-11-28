package com;


public class Test08 {

	public static void main(String[] args) {
		for (int a = 1; a <= 1000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				System.out.println(a);
			}
		}
	}
}
