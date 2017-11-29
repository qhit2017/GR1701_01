package com.zk.qhit;

/**
 * @author 
 * @date 创建时间：2017年11月18日 下午5:16:35
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class Integer {

	public static void main(String[] args) {
		// 求个位数为6，且能被3整除的3位整数有多少
		int number = 0;
		for (int i = 100; i <= 1000; i++) {
			if (i % 3 == 0 && i % 10 == 6) {
				System.out.print(i + "\t");
				number++;
			}
		}

		System.out.println();
		System.out.println(number);

	}
}
