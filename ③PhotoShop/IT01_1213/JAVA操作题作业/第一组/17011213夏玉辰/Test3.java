package com.qhit;



public class Test3 {
		
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 10000; i <= 99999; i++) {
			if (i%10==6&&i%3==0) {
				System.out.println(i);
			sum++;
			}
		}
		
		System.out.println(sum);
	}
}
