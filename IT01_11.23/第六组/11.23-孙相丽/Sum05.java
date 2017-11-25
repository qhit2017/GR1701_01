package com.sxl;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		//---------------------------------------
		int sum1 = 0;
		int j=1;
		while (j<=100) {
			sum1 += j;
			j+=2;
		}
		
		System.out.println(sum1);

	}

}
