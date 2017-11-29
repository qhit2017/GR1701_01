package com.zhangtongtong.qhit01;

/**
 * 作者：张彤彤 E-mail:1346528669@qq.com 电话:15036836634
 * 
 * 创建时间：2017年11月18日 下午12:22:52
 */
public class Test4 {
	public static void main(String[] args) {

		System.out.print("1000以内所有8的倍数之和为：");

		int sum = 0;

		for (int i = 1; i <= 1000; i++) {

			if (i % 8 == 0) {
				sum += i;
			}

		}
		System.out.println(sum);

	}

}
