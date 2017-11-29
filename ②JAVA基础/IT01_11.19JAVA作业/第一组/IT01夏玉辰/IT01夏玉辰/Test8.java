package com.zhangtongtong.qhit01;

public class Test8 {
	public static void main(String[] args) {

		System.out.println("个位数为6且能被3整除的数如下表示");
		int sum = 0;
		for (int i = 100; i < 1000; i++) {

			if ((i % 10 == 6) && (i % 3 == 0)) {

				System.out.print(i + "\t");
				sum += 1;
				
				if (sum % 6 == 0) {
					
					System.out.println();

				}
			}
		}
	}

}
