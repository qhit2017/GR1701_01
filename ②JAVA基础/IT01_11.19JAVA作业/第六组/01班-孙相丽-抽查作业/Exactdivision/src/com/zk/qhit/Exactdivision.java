package com.zk.qhit;

/**
 * @author 
 * @date 创建时间：2017年11月18日 下午4:33:31
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class Exactdivision {

	public static void main(String[] args) {

		// 求出一千以内既能被5整除，又能被三整除的所有整数（使用do...while循环）
		int i = 1;
		do {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 1000);

	}
}
