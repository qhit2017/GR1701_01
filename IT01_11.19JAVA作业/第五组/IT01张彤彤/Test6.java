package com.zhangtongtong.qhit01;

/**
 * 作者：张彤彤 E-mail:1346528669@qq.com 电话:15036836634
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
