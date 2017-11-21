package com.zk.qhit;

/**
 * @author 
 * @date 创建时间：2017年11月18日 下午4:21:35
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class SumDeom {
	public static void main(String[] args) {
		// 求出一千以内所有8的倍数之和
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 8 == 0) {
				sum += i;
			}

		}

		System.out.println(sum);
	}

}
