package com.gaojie.qhit01;

/**
 * 作者：张彤彤
 * 
 * 创建时间：2017年11月23日 下午8:22:54
 */
public class Odd {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) {
				sum += i;

			}

		}
		System.out.println("1到100之间的奇数和为：" + sum);
	}

}
