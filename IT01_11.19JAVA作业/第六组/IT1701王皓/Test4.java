package com.wanghao.qhit01;

/**
 * 作者：王皓 E-mail:954610522@qq.com 
 * 
 * 创建时间：2017年11月18日 下午20:50:19
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
