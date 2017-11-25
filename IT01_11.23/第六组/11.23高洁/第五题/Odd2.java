package com.gaojie.qhit01;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月23日 下午8:29:24
 */
public class Odd2 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += i;
			}

		i++;}
		System.out.println("1到100之间的奇数和为：" + sum);
	}

}
