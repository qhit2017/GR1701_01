package com;


public class Test07 {

	public static void main(String[] args) {
		int a = 1;
		while (a <= 1000) {
			if (a % 5 == 0 && a % 10 != 0) {
				System.out.println(a);				
			}
			a++;
		}
	}
}
