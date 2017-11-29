package com.gaojie.qhit01;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月18日 下午12:41:14
 */
public class Test6 {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			
			sum += i;
			
			if (sum > 20) {
				
				System.out.println("当数字为" + i + "时累加值开始大于20");
				break;
			}

		}

	}

}
