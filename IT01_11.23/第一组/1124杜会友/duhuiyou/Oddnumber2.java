package com.duhuiyou;

public class Oddnumber2 {
	public static void main(String[] args) {
		System.out.println("while—≠ª∑");
		int x = 1;
		int sum = 0;

		while (x < 100) {
			if (x % 2 != 0)
				sum += x;
			x++;
		}
		System.out.println(sum);

	}
}
